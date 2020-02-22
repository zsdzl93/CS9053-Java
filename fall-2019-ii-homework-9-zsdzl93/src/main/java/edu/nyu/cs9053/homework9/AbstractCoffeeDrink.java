package edu.nyu.cs9053.homework9;

public abstract class AbstractCoffeeDrink implements CoffeeDrink {
    private final boolean decafForCoffeeDrink;
    private final boolean containsMilkForCoffeeDrink;

    protected AbstractCoffeeDrink(boolean decafForCoffeeDrink, boolean containsMilkForCoffeeDrink) {
        this.decafForCoffeeDrink = decafForCoffeeDrink;
        this.containsMilkForCoffeeDrink = containsMilkForCoffeeDrink;
    }

    @Override
    public boolean isDecaf() {
        return decafForCoffeeDrink;
    }

    @Override
    public boolean containsMilk() {
        return containsMilkForCoffeeDrink;
    }
}
