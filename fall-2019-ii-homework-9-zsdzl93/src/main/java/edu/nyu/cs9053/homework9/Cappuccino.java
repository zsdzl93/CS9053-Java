package edu.nyu.cs9053.homework9;

public class Cappuccino extends AbstractCoffeeDrink {
    private static final boolean DECAF_FOR_CAPPUCCINO = true;
    private static final boolean CONTAINSMILK_FOR_CAPPUCCINO = false;
    private final String customerName;

    public Cappuccino(String customerName) {
        super(DECAF_FOR_CAPPUCCINO, CONTAINSMILK_FOR_CAPPUCCINO);
        this.customerName = customerName;
    }
}
