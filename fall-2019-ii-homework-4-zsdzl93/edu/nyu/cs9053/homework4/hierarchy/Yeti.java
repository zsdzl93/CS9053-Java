package edu.nyu.cs9053.homework4.hierarchy;

public class Yeti extends AbstractMonster {
    public final String hairColor;

    public Yeti(Boolean isMythical, String name, String color) {
        super(isMythical, name);
        this.hairColor = color;
    }

    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }

        if((obj == null ) || (getClass() != obj.getClass())) {
            return false;
        }

        Yeti that = (Yeti) obj;

        return (this.isMythical == that.isMythical)
                && (this.getName() == null ? that.getName() == null : this.getName() == that.getName())
                && (this.hairColor == null ? that.hairColor == null : this.hairColor == that.hairColor);
    }

    @Override public int hashCode() {
        int hashForMythical = Boolean.hashCode(this.mythical());
        int hashForName = (this.getName()== null ? 0: this.getName().hashCode());
        int hashForHairColor = (this.hairColor == null ? 0: this.hairColor.hashCode());
        return ((hashForMythical * 31) + (hashForName * 37) + (hashForHairColor * 41));
    }
}
