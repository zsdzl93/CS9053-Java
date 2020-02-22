package edu.nyu.cs9053.homework10;

import java.util.concurrent.ExecutorService;

/**
 * User: blangel
 */
public class MiddleAgesFortification extends AbstractFortification implements Fortification<Thread> {
    private final CustomThreadPool customThreadPool;

    public MiddleAgesFortification(int concurrencyFactor) {
        super(concurrencyFactor);
        customThreadPool = new CustomThreadPoolImp(concurrencyFactor);
    }

    @Override
    public void handleAttack(final AttackHandler handler) {
        customThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                handler.soldiersReady();
            }
        });
    }

    @Override
    public void surrender() {
        customThreadPool.stop();
    }
}
