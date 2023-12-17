package semaphore;

public class MainSemaphore {
    public static void main(String[] args) {
        MySemaphore semaphore = new MySemaphore(2);
        new Worker(semaphore, 1).start();
        new Worker(semaphore, 2).start();
        new Worker(semaphore, 3).start();
        new Worker(semaphore, 4).start();
        new Worker(semaphore, 5).start();
        new Worker(semaphore, 6).start();
    }
}
