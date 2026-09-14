package machinecoding.snakeandladder.entity;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    private final int min;
    private final int max;

    public Dice(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandom() {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
