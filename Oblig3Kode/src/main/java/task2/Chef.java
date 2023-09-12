package task2;

public class Chef implements Runnable{

    private String name;
    private Tray tray;

    public Chef(String name, Tray tray) {
        this.name = name;
        this.tray = tray;
    }

    @Override
    public void run(){

    }
}
