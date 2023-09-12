package task2;

import java.util.Random;

public class Waiter implements Runnable {

    private String name;
    private Tray tray;

    public Waiter(String name, Tray tray) {
        this.name = name;
        this.tray = tray;
    }

    @Override
    public void run(){
        Random random = new Random();
        while(true){

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            Hamburger burger = tray.getBurger();
            System.out.println(this.name + "(Waitor) took burger: " + burger.getId() + "current number of burgers: " + tray.getLength());
        }
    }
}
