package edu.nyu.cs9053.homework7;

public class BarnTransfer {
    public <T extends Animal> void transfer(Barn<? extends T> barnFrom, Barn<? super T> barnTo) {
        if (barnFrom == null || barnTo == null) {
            throw new IllegalArgumentException("barnFrom or barnTo cannot be null");
        }

        for (int i=0; i<barnFrom.size(); i++) {
            T itemInFrom = barnFrom.get(i);
            barnTo.add(itemInFrom);
        }
    }
}
