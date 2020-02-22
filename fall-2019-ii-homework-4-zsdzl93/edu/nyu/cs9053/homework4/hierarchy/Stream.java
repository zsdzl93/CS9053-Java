package edu.nyu.cs9053.homework4.hierarchy;

public abstract class Stream extends FreshWater{
    private final double flow;
    
    protected Stream(String name, double volume, double flow) {
        super(name, volume);
        this.flow = flow;
    }
    
    public double getFlow() {
        return flow;
    }
}