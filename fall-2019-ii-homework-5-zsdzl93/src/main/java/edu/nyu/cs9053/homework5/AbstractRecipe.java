package edu.nyu.cs9053.homework5;
import java.util.concurrent.atomic.AtomicReference;

/**
 * User: Zhenglin Dong
 */
public abstract class AbstractRecipe implements Recipe {
    
    private final int volumeCubicInches;
    // time to finish
    protected final AtomicReference<Double> timeExpected;
    // time elapsed
    protected final AtomicReference<Double> timeSpent;
     
    protected AbstractRecipe(int volumeCubicInches) {
        this.timeExpected = new AtomicReference<Double>(0d);
        this.timeSpent = new AtomicReference<Double>(0d);
        this.volumeCubicInches = volumeCubicInches;
    }
     
    @Override
    public abstract void initializeFromOven(Oven oven);
     
     /**
      * @return the food's volume in cubic inches
      */
    @Override
    public int getVolumeCubicInches() {
        return volumeCubicInches;
    }
     
     /**
      * @return the remaining seconds until the recipe is done. if 0, this recipe is complete and should
      *         be removed from the {@linkplain Oven}
      */
    @Override
    public Double getRemainingSecondsUntilDone() {
        return timeExpected.get() <= timeSpent.get() ? 0d : timeExpected.get() - timeSpent.get();
    }
    
    /**
     * Adjust the remaining seconds done based on the amount of update time and the current oven temperature
     * @param unit   of time which has update with the existing oven temperature
     * @param amount of time which has update with the existing oven temperature
     * @param ovenTemperature the potentially new current oven temperature
     */
    @Override
    public abstract void adjust(Time unit, int amount, int ovenTemperature);

    /**
     * @return true if the recipe is done and should be removed from the oven
     */
    @Override
    public boolean isRecipeDone() {
        return timeExpected.get() <= timeSpent.get();
    }
    
    public void setTimeSpent(Time unit, int amount) {
        switch (unit) {
            case Minutes:
                timeSpent.set(timeSpent.get() + (double) amount * (60d));
                break;
            case Seconds:
                timeSpent.set(timeSpent.get() + (double) amount);
                break;
            default:
                throw new AssertionError();
        }
    }
    
 }