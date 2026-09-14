package machinecoding.snakeandladder.entity;

import java.util.Map;

public class Board {
    private final int startNumber;
    private final int endNumber;
    private final Map<Integer, Integer> snakes;
    private final Map<Integer, Integer> ladders;

    public Board(int startNumber, int endNumber, Map<Integer, Integer> snakes, Map<Integer, Integer> ladders) {
        this.startNumber = startNumber;
        this.endNumber = endNumber;
        this.snakes = snakes;
        this.ladders = ladders;
    }

    public int getEndNumber() {
        return endNumber;
    }

    public int resolveSnakeAndLadders(int position) {
        if (snakes.containsKey(position)) {
            System.out.println("Encountered a snake");
            return snakes.get(position);
        } else if (ladders.containsKey(position)) {
            System.out.println("Encountered a ladder");
            return ladders.get(position);
        } else return position;
    }
}
