package edu.nyu.cs9053.homework9;

import java.util.concurrent.Semaphore;

public class BaristaImp implements Barista {
    private final Semaphore semaphore;

    public BaristaImp(Semaphore semaphore) {
        if (semaphore == null) {
            throw new IllegalArgumentException("semaphore cannot be null");
        }
        this.semaphore = semaphore;
    }

    @Override
    public OrderNumber handle(Queue from) {
        if (from == null) {
            throw new IllegalArgumentException("handle queue cannot be null");
        }

        try {
            semaphore.acquire();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ie);
        }
        try {
            if (!from.isEmpty()) {
                return from.getOrderNumber();
            } else {
                return null;
            }
        } finally {
            semaphore.release();
        }
    }
}
