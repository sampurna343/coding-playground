package machinecoding.connectionpool;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;


/**
 * 1.minSize
 * 2.highly concurrent
 * 3.timeout-autorelease
 */
public class ConnectionPool {

    private final int maxSize;
    private final List<Connection> totalConnections;
    private final BlockingQueue<Connection> availableConnections;

    public ConnectionPool(int maxSize) {
        this.maxSize = maxSize;
        this.totalConnections = new ArrayList<>();
        this.availableConnections = new LinkedBlockingQueue<>();
        for (int i = 0; i < maxSize; i++) {
            Connection c = new Connection();
            totalConnections.add(c);
            availableConnections.add(c);
        }
    }

    public Connection getConnection() {
        if (!availableConnections.isEmpty()) {
            Connection conn = availableConnections.poll();
            conn.makeBusy();
            System.out.println("connection retrieved : " + conn.getId());
            return conn;
        }
        System.out.println("connection busy");
        return null;
    }

    public void releaseConnection(Connection conn) {
        conn.makeAvailable();
        availableConnections.add(conn);
        System.out.println("connection released : " + conn.getId());
    }

    public int getMaxSize() {
        return maxSize;
    }
}
