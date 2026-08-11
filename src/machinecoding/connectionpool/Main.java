package machinecoding.connectionpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ConnectionPool pool = new ConnectionPool(10);
        ExecutorService ex = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 12; i++) {
            ex.submit(() -> {
                //System.out.println(Thread.currentThread().getName());
                Connection conn = pool.getConnection();
                conn.action();
                pool.releaseConnection(conn);
            });
        }
        ex.shutdown();
    }
}
