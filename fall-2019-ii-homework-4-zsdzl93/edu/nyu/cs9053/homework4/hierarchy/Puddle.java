package edu.nyu.cs9053.homework4.hierarchy;

public class Puddle extends FreshWater {
    // Location for each water as particular instance field
    private final String location;
    
    public Puddle(String name, double volume, String location) {
        super(name, volume);
        this.location = location;
    }
    
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if((obj == null ) || (getClass() != obj.getClass())) {
            return false;
        }
        
        Puddle that = (Puddle) obj;
        
        return (this.getName() == null ? that.getName() == null : this.getName() == that.getName())
        && (Double.compare(this.getVolume(), that.getVolume()) == 0)
        && (this.location == null ? that.location == null : this.location == that.location);
    }
    
    @Override public int hashCode() {
        int hashForName = (this.getName()== null ? 0: this.getName().hashCode());
        int hashForVolume = Double.hashCode(this.getVolume());
        int hashForLocation = (this.location == null ? 0: this.location.hashCode());
        return ((hashForName * 31) + (hashForVolume * 37) + (hashForLocation * 41));
    }
}