package edu.nyu.cs9053.homework9;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class CustomerImp implements Customer {
    private final Semaphore semaphore;
    private final Random random;

    public CustomerImp(Semaphore semaphore) {
        if(semaphore == null) {
            throw new IllegalArgumentException("semaphore cannot be null");
        }
        this.semaphore = semaphore;
        this.random = new Random();
    }

    @Override
    public OrderNumber order(Queue queue) {
        if (queue == null) {
            throw new IllegalArgumentException("order queue cannot be null");
        }

        try {
            semaphore.acquire();
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new RuntimeException(ie);
        }
        try {
            if (!queue.full()) {
                CoffeeDrink coffeeDrink = generateCoffeeDrink();
                return queue.addOrder(coffeeDrink);
            } else {
                return null;
            }
        } finally {
            semaphore.release();
        }
    }

    private CoffeeDrink generateCoffeeDrink() {
        switch (random.nextInt(3)) {
            case 0:
                return new Cappuccino("Tony");
            case 1:
                return new Affogato("Lucifer");
            case 2:
                return new Cortado("Yang");
            default:
                throw new IllegalArgumentException("random seed failed");
        }
    }
}
