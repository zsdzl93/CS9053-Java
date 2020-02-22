package edu.nyu.cs9053.homework4.hierarchy;

public class Ghoul extends AbstractMonster {
    public final Boolean shapeShifting;

    public Ghoul(Boolean isMythical, String name, Boolean shapeShifting) {
        super(isMythical, name);
        this.shapeShifting = shapeShifting;
    }

    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if((obj == null ) || (getClass() != obj.getClass())) {
            return false;
        }

        Ghoul that = (Ghoul) obj;

        return (this.isMythical == that.isMythical)
                && (this.getName() == null ? that.getName() == null : this.getName() == that.getName())
                && (this.shapeShifting == that.shapeShifting);
    }

    @Override public int hashCode() {
        int hashForMythical = Boolean.hashCode(this.mythical());
        int hashForName = (this.getName()== null ? 0: this.getName().hashCode());
        int hashForShapeShifting = Boolean.hashCode(this.shapeShifting);
        return ((hashForMythical * 31) + (hashForName * 37) + (hashForShapeShifting * 41));
    }
}
