package edu.nyu.cs9053.homework9;

public class Cortado extends AbstractCoffeeDrink {
    private static final boolean DECAF_FOR_CORTADO = true;
    private static final boolean CONTAINSMILK_FOR_CORTADO = false;
    private final String customerName;

    public Cortado(String customerName) {
        super(DECAF_FOR_CORTADO, CONTAINSMILK_FOR_CORTADO);
        this.customerName = customerName;
    }
}
