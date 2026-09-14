package machinecoding.snakeandladder.entity;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private final Board board;
    private final List<Player> players;
    private final List<Dice> dices;

    private final Queue<Player> queue;

    public Game(Board board, List<Player> players, List<Dice> dices) {
        this.board = board;
        this.players = players;
        this.dices = dices;

        this.queue = new LinkedList<>();
        this.queue.addAll(this.players);
    }

    public void start() {

        while (!queue.isEmpty()) {
            Player currentPlayer = queue.poll();
            System.out.println("Current Player : " + currentPlayer.getColor() + "-" + currentPlayer.getPosition());

            int jump = rollDice();
            int newPosition = currentPlayer.getPosition() + jump;
            newPosition = board.resolveSnakeAndLadders(newPosition);

            if (newPosition <= board.getEndNumber()) {
                currentPlayer.setPosition(newPosition);
            }

            //Game completion check
            if (newPosition == board.getEndNumber()) {
                System.out.println("Current Player : " + currentPlayer.getColor() + " is the Winner");
                break;
            }
            queue.add(currentPlayer);
        }
    }

    private int rollDice() {
        int sum = 0;
        for (Dice dice : dices) {
            sum = sum + dice.getRandom();
        }
        return sum;
    }

}
