package edu.nyu.cs9053.homework4.hierarchy;

public abstract class AbstractMonster implements Monster {
    protected final boolean isMythical;

    protected final String name;

    protected AbstractMonster(boolean isMythical, String name) {
        this.isMythical = isMythical;
        this.name = name;
    }

    @Override
    public Boolean mythical() {
        return this.isMythical;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
