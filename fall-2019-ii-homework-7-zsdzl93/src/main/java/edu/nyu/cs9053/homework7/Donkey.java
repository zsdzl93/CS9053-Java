package edu.nyu.cs9053.homework7;

public abstract class Donkey implements Animal {
    private final String name;

    public Donkey(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj ==null || this.getClass() != obj.getClass()) {
            return false;
        }

        Donkey that = (Donkey) obj;
        return (this.getName() == null ? that.getName() == null : this.getName() == that.getName());
    }

    @Override
    public int hashCode() {
        int hashForName = (this.getName() == null ? 0 : this.getName().hashCode());
        return hashForName * 31;
    }
}
