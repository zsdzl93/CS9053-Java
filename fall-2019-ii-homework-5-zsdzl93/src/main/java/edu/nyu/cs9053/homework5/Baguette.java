package edu.nyu.cs9053.homework5;
import java.util.concurrent.atomic.AtomicReference;

/**
 * User: Zhenglin Dong
 */
public class Baguette extends AbstractRecipe {
    
    // decay constant
    private final double constLambda;
    
    private static final int baguetteVolume = 2000;
    
    // construct lambda and volume
    public Baguette(double constLambda) {
        super(baguetteVolume);
        this.constLambda = constLambda;
    }
    
    @Override
    public void initializeFromOven(Oven oven) {
        //{N(t) = N(0) * e^(-lambda * t)}
        timeExpected.set(20d * Math.exp(constLambda * (300 - oven.getSetTemperature())) * 60d);
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
        timeExpected.set(20d * Math.exp(constLambda * (300 - ovenTemperature)) * 60d);
    }
    
}