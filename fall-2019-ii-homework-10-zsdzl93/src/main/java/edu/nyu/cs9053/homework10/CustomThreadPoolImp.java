package edu.nyu.cs9053.homework10;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class CustomThreadPoolImp implements CustomThreadPool {

    private final BlockingQueue<Runnable> taskQueue;
    private final CustomThread[] customThreads;
    private final int concurrencyFactor;

    public CustomThreadPoolImp(int concurrencyFactor) {
        this.concurrencyFactor = concurrencyFactor;
        taskQueue = new LinkedBlockingQueue<Runnable>(concurrencyFactor);
        customThreads = new CustomThread[concurrencyFactor];

        for (int i=0; i<concurrencyFactor; i++) {
            customThreads[i] = new CustomThread(taskQueue);
            customThreads[i].start();
        }
    }

    @Override
    public void submit(Runnable runnable) {
        if (runnable == null) {
            throw new IllegalArgumentException("submit runnable cannot be null");
        }
        try {
            taskQueue.put(runnable);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ie);
        }
    }

    @Override
    public void stop() {
        for (CustomThread customThread : customThreads) {
            customThread.terminate();
        }
    }
}
