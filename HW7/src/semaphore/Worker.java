package semaphore;

public class Worker extends Thread {

    private final MySemaphore mSemaphore;
    private final int mNum;

    public Worker(MySemaphore semaphore, int num) {
        mSemaphore = semaphore;
        mNum = num;
    }

    @Override
    public void run() {
        try {
            mSemaphore.take();
            System.out.println("Worker " + mNum + " started the work");

            sleep(500);
            mSemaphore.release();
            System.out.println("Worker " + mNum + " completed the work");
        } catch (InterruptedException ignored) {

        }
    }
}
