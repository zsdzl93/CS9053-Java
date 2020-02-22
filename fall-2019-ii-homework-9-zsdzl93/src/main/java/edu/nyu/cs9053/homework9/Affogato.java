package edu.nyu.cs9053.homework9;

public class Affogato extends AbstractCoffeeDrink {
    private static final boolean DECAF_FOR_AFFOGATO = true;
    private static final boolean CONTAINSMILK_FOR_AFFOGATO = false;
    private final String customerName;

    public Affogato(String customerName) {
        super(DECAF_FOR_AFFOGATO, CONTAINSMILK_FOR_AFFOGATO);
        this.customerName = customerName;
    }
}
