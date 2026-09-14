package machinecoding.snakeandladder;

import machinecoding.snakeandladder.entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> snakes = Map.of(30, 20, 76, 50, 99, 10);
        Map<Integer, Integer> ladders = Map.of(15, 35, 25, 39, 67, 96);

        Board board = new Board(1, 100, snakes, ladders);

        List<Player> players = List.of(new Player(COLOR.RED), new Player(COLOR.BLUE), new Player(COLOR.GREEN), new Player(COLOR.YELLOW));
        List<Dice> dices = List.of(new Dice(1,6));

        Game game = new Game(board, players, dices);

        game.start();
    }
}
