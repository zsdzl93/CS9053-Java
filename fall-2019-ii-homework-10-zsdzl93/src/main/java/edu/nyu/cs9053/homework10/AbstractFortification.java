package edu.nyu.cs9053.homework10;

public abstract class AbstractFortification implements ConcurrencyFactorProvider {

    private final int concurrencyFactor;

    protected AbstractFortification(int concurrencyFactor) {
        this.concurrencyFactor = concurrencyFactor;
    }

    @Override
    public int getConcurrencyFactor() {
        return concurrencyFactor;
    }
}
