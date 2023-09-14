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
                Thread.sleep(random.nextInt(2_000, 6_000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            Hamburger burger = null;
            try {
                burger = tray.getBurger();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(this.name + " (Waitor) took burger: (id)  " + burger.getId() + " current number of burgers: " + tray.getLength());
        }
    }
}
