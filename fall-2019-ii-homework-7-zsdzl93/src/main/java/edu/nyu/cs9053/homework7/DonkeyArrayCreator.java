package edu.nyu.cs9053.homework7;

public class DonkeyArrayCreator implements ArrayCreator {

    @Override
    public Donkey[] create(int size) {
        Donkey[] newArray = new Donkey[size];
        return newArray;
    }

}
