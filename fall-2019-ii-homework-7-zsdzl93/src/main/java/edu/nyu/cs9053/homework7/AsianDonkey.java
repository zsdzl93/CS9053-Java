package edu.nyu.cs9053.homework7;

public class AsianDonkey extends Donkey {
    public AsianDonkey(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj ==null || this.getClass() != obj.getClass()) {
            return false;
        }

        AsianDonkey that = (AsianDonkey) obj;
        return (this.getName() == null ? that.getName() == null : this.getName() == that.getName());
    }

    @Override
    public int hashCode() {
        int hashForName = (this.getName() == null ? 0 : this.getName().hashCode());
        return hashForName;
    }
}
