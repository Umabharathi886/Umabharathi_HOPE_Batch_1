import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SimplethreadPool {

    private BlockingQueue<Runnable> queue;

    public SimplethreadPool(int numThreads) {

        queue = new LinkedBlockingQueue<>();

        for (int i = 0; i < numThreads; i++) {
            WorkerThread worker = new WorkerThread(queue);
            worker.start();
        }
    }

    public void execute(Runnable task) {
        try {
            queue.put(task);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
