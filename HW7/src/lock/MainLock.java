package lock;

public class MainLock {
    public static void main(String[] args) {
        MyConcurrentList<String> list = new MyConcurrentList<>();
        new Thread(
                () -> {
                    list.add("value");
                }
        ).start();
        new Thread(
                () -> {
                    System.out.println(list.getElement(0));
                }
        ).start();
        new Thread(
                () -> {
                    System.out.println(list.getElement(0));
                }
        ).start();
    }
}
