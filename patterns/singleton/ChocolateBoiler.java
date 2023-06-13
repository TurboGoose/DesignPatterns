package singleton;

public class ChocolateBoiler {
    private boolean empty = true;
    private boolean boiled = false;
    private static volatile ChocolateBoiler INSTANCE;

    private ChocolateBoiler() {}

    public static ChocolateBoiler getInstance() {
        if (INSTANCE == null) {
            synchronized (ChocolateBoiler.class) {
                if (INSTANCE == null) {
                    INSTANCE = new ChocolateBoiler();
                }
            }
        }
        return INSTANCE;
    }

    public void fill() {
        if (empty && !boiled) {
            System.out.println(Thread.currentThread().getName() + " : Filling...");
            empty = false;
        }
    }

    public void boil() {
        if (!empty && !boiled) {
            System.out.println(Thread.currentThread().getName() + " : Boiling...");
            boiled = true;
        }
    }

    public void drain() {
        if (!empty && boiled) {
            System.out.println(Thread.currentThread().getName() + " : Draining...");
            empty = true;
            boiled = false;
        }
    }

    public static void main(String[] args) {
        Runnable task = () -> {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            for (int i = 0; i < 10; i++) {
                boiler.fill();
                sleep();

                boiler.boil();
                sleep();

                boiler.drain();
                sleep();
            }
        };
        new Thread(task).start();
        new Thread(task).start();
    }

    private static void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignore) {}
    }
}
