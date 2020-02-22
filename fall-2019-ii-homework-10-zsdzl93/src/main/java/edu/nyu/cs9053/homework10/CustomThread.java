package edu.nyu.cs9053.homework10;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class CustomThread extends Thread {

    private static final Runnable DEFAULT_NULL_RUNNABLE =  null;
    private final AtomicBoolean  canRun;
    private final BlockingQueue<Runnable> taskQueue;

    public CustomThread(BlockingQueue<Runnable> taskQueue) {
        if (taskQueue == null) {
            throw new IllegalArgumentException("task queue cannot be null");
        }
        this.taskQueue = taskQueue;
        canRun = new AtomicBoolean(true);
    }

    @Override
    public void run() {
        Runnable runnable = DEFAULT_NULL_RUNNABLE;
        while (canRun.get()) {
            try{
                runnable = taskQueue.take();
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(ie);
            }
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (RuntimeException re) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(re);
                }
            }
        }
    }

    public synchronized void terminate() {
        canRun.set(false);
        Thread.currentThread().interrupt();
    }
}
