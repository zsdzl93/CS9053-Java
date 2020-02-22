package edu.nyu.cs9053.homework4;

public enum OceanName {
    PacificOcean(165250000d),
    
    AtlanticOcean(106460000d),
    
    IndianOcean(70560000d),
    
    AntarcticOcean(10700000d),
    
    ArcticOcean(1100000d);
    
    private final double area;
    
    private OceanName(double area) {
        this.area = area;
    }
    
    public double getArea() {
        return area;
    }
    
    public static void printOceanName(OceanName... args) {
        if(args == null) {
            System.out.println("Arguments cannot be null");
            return;
        }
        
        for(OceanName oceanName : args) {
            System.out.println(oceanName.getArea());
        }
    }
}