package task2;

public class Waiter implements Runnable {

    private String name;
    private Tray tray;

    public Waiter(String name, Tray tray) {
        this.name = name;
        this.tray = tray;
    }

    @Override
    public void run(){

    }
}
