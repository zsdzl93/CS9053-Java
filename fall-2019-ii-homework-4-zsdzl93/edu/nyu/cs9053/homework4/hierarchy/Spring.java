package edu.nyu.cs9053.homework4.hierarchy;

public class Spring extends Stream {
    // Location for each water as particular instance field
    private final String location;
    
    public Spring(String name, double volume, double flow, String location) {
        super(name, volume, flow);
        this.location = location;
    }
    
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if((obj == null ) || (getClass() != obj.getClass())) {
            return false;
        }
        
        Spring that = (Spring) obj;
        
        return (this.getName() == null ? that.getName() == null : this.getName() == that.getName())
        && (Double.compare(this.getVolume(), that.getVolume()) == 0)
        && (this.location == null ? that.location == null : this.location == that.location)
        && (Double.compare(this.getFlow(), that.getFlow()) == 0);
    }
    
    @Override public int hashCode() {   
        int hashForName = (this.getName()== null ? 0: this.getName().hashCode());
        int hashForVolume = Double.hashCode(this.getVolume());
        int hashForLocation = (this.location == null ? 0: this.location.hashCode());
        int hashForFlow = Double.hashCode(this.getFlow());
        return ((hashForName * 31) + (hashForVolume * 37) + (hashForLocation * 41) + (hashForFlow * 47));
    }
}