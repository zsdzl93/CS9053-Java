package edu.nyu.cs9053.homework5;
import java.util.concurrent.atomic.AtomicReference;

/**
 * User: Zhenglin Dong
 */
public class RoastedSweetPotato extends AbstractRecipe {
    
    private static final int roastedSweetPotatoVolume = 6000;
    
    // construct volume
    public RoastedSweetPotato() {
        super(roastedSweetPotatoVolume);
    }
    
    @Override
    public void initializeFromOven(Oven oven) {
        timeExpected.set(oven.getSetTemperature() * (0.1d) * (60d));
    }
    
    /**
     * Adjust the remaining seconds done based on the amount of update time and the current oven temperature
     * @param unit   of time which has update with the existing oven temperature
     * @param amount of time which has update with the existing oven temperature
     * @param ovenTemperature the potentially new current oven temperature
     */
    @Override
    public void adjust(Time unit, int amount, int ovenTemperature) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        setTimeSpent(unit, amount);
        timeExpected.set((double) ovenTemperature * (0.1d) * (60d));
    }
    
}