package edu.nyu.cs9053.homework4.hierarchy;

public class Gulf extends SaltWater {
    // Location for each water as particular instance field
    private final String location;
    
    private final int connectedWaterBodiesCount;
    
    public Gulf(String name, double volume, int connectedWaterBodiesCount, String location) {
        super(name, volume);
        this.connectedWaterBodiesCount = connectedWaterBodiesCount;
        this.location = location;
    }
    
    public int getConnectedWaterBodiesCount() {
        return connectedWaterBodiesCount;
    }
    
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        
        if((obj == null ) || (getClass() != obj.getClass())) {
            return false;
        }
        
        Gulf that = (Gulf) obj;
        
        return (this.getName() == null ? that.getName() == null : this.getName() == that.getName())
        && (Double.compare(this.getVolume(), that.getVolume()) == 0)
        && (this.location == null ? that.location == null : this.location == that.location)
        && (this.connectedWaterBodiesCount == that.connectedWaterBodiesCount);
    }
    
    @Override public int hashCode() {
        int hashForName = (this.getName()== null ? 0: this.getName().hashCode());
        int hashForVolume = Double.hashCode(this.getVolume());
        int hashForLocation = (this.location == null ? 0: this.location.hashCode());
        return ((hashForName * 31) + (hashForVolume * 37) + (hashForLocation * 41) + (this.connectedWaterBodiesCount * 47));
    }
}