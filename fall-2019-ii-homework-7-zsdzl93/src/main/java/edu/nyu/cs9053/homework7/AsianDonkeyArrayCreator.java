package edu.nyu.cs9053.homework7;

public class AsianDonkeyArrayCreator implements ArrayCreator {
    public AsianDonkeyArrayCreator() {
    }

    @Override
    public Donkey[] create(int size) {
        Donkey[] newArray = new Donkey[size];
        return newArray;
    }
}
