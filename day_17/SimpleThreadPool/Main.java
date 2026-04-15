public class Main {

    public static void main(String[] args) {

        SimplethreadPool pool = new SimplethreadPool(3);

        for (int i = 1; i <= 10; i++) {
            Task task = new Task(i);
            pool.execute(task);
        }
    }
}
