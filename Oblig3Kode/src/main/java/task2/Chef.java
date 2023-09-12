package task2;

import java.util.Random;

public class Chef implements Runnable{

    private String name;
    private Tray tray;

    public Chef(String name, Tray tray) {
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

            Hamburger hamburger = new Hamburger();
            tray.addBurger(hamburger);
            System.out.println(this.name + "(chef) made a burger: " + hamburger.getId() + " current number of burgers: " + tray.getLength());
        }

    }

}
