package machinecoding.snakeandladder.entity;

public class Player {
    private final COLOR color;
    private int position;

    public Player(COLOR color) {
        this.color = color;
        this.position = 1;
    }

    public COLOR getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
