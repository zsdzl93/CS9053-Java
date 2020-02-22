package edu.nyu.cs9053.homework4.hierarchy;

public abstract class BodyOfWater {
    private final String name;
    
    private final double volume;
    
    protected BodyOfWater(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }
    
    public String getName() {
        return name;
    }
    
    public double getVolume() {
        return volume;
    }
}