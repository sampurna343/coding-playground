package machinecoding.connectionpool;

import java.util.concurrent.ThreadLocalRandom;

public class Connection {

    private final int id;
    private Status status;

    public Connection() {
        this.id = ThreadLocalRandom.current().nextInt(1000000);
        this.status = Status.AVAILABLE;
    }

    public void action() {
        System.out.println("Doing work conn id: " + id);
    }

    public void makeAvailable() {
        status = Status.AVAILABLE;
    }

    public void makeBusy() {
        status = Status.BUSY;
    }

    public int getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }
}
