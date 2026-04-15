public class Task implements Runnable {

    private int taskNumber;

    public Task(int num) {
        this.taskNumber = num;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskNumber + " executed by " 
                + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
