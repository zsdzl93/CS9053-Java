package edu.nyu.cs9053.homework5;
import java.util.concurrent.atomic.AtomicReference;

/**
 * User: Zhenglin Dong
 */
public class PotRoast extends AbstractRecipe {
    
    private static final int potRoastVolume = 10000;
    
    // construct volume 10000
    public PotRoast() {
        super(potRoastVolume);
    }
    
    @Override
    public void initializeFromOven(Oven oven) {
        timeExpected.set(oven.getSetTemperature() * (0.2d) * (60d));
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
        timeExpected.set((double) ovenTemperature * (0.2d) * (60d));
    }
    
}