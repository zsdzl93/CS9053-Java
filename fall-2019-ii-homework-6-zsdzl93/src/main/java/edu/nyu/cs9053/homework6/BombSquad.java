package edu.nyu.cs9053.homework6;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * User: blangel
 * Date: 10/11/17
 * Time: 7:57 AM
 */
public class BombSquad {

    public static void main(String[] args) {
        EvilVillain villain = new EvilVillain();
        BombSquad squad = new BombSquad();
        System.out.printf("%nThere's an evil villain ( \u2620 ) on the loose...hurry and stop him...%n%n");
        while (villain.notCaptured()) {
            Bomb bomb = villain.terrorize();
            squad.investigate(bomb);
        }
        System.out.printf("You've caught the evil villain, nice job!%n  Waiting to ensure you've correctly diffused all the villain's existing bombs...%n");
        squad.shutdown();
        shutdownVillain(villain);
    }

    private static void shutdownVillain(EvilVillain villain) {
        try {
            Method waitMethod = villain.getClass().getDeclaredMethod("waitForAllExistingBombs", Runnable.class);
            waitMethod.setAccessible(true);
            waitMethod.invoke(villain, new Runnable() {
                @Override public void run() {
                    System.out.printf("Crisis averted! Great job! \uD83C\uDFC6%n");
                }
            });
        } catch (Throwable t) {
            throw new AssertionError(t);
        }
    }

    private final ScheduledExecutorService executor;

    private final Set<BombSquadTechnician> technicians;

    public BombSquad() {
        this.executor = Executors.newSingleThreadScheduledExecutor();
        this.technicians = new HashSet<>(1);
    }

    private void investigate(Bomb bomb) {
        executor.schedule(new Callable<Void>() {
            @Override public Void call() throws Exception {
                BombSquadTechnician technician = BombSquadTechnicianRecruiter.recruit();
                if (technicians.add(technician)) {
                    if (technicians.size() > 1) {
                        System.out.printf("There's only budget for one technician, make it your best one!");
                        System.exit(1);
                    }
                }
                try {
                    WireDiagram diagram = technician.assess(bomb);
                    technician.defuse(bomb, diagram);
                } catch (Throwable t) {
                    System.out.printf("BombSquadTechnician failed [ %s ]!%n", t.getMessage());
                    System.exit(1);
                }
                return null;
            }
        }, 5L, TimeUnit.SECONDS);
    }

    private void shutdown() {
        executor.shutdown();
    }

}
