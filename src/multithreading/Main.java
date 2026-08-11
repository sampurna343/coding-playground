package multithreading;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int total = 100;
        int threadsize = 5;
        int chunksize = total / threadsize; //20
        int start = 1;

        ExecutorService ex = Executors.newFixedThreadPool(threadsize);
        for (int i = 1; i <= threadsize; i++) {
            int itr = i;
            Future<Integer> fut = ex.submit(() -> print(1 + (itr * chunksize) - chunksize, itr * chunksize, Thread.currentThread().getName()));
            int op = fut.get();
            System.out.println(op);
        }
        ex.shutdown();
    }

    private static int print(int start, int end, String threadName) {
        for (int i = start; i <= end; i++) {
            System.out.println(threadName + " : " + i);
        }
        return 0;
    }
}

















