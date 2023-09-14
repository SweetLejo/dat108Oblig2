package task2;

import java.util.LinkedList;

public class Tray {

    private LinkedList<Hamburger> burgers;
    public int capacity;

    public Tray(int capacity) {
        this.burgers = new LinkedList<>();
        this.capacity = capacity;
    }

    public Tray() {
        this.burgers = new LinkedList<>();
        this.capacity = 4;
    }
    public synchronized boolean isEmpty(){
        return burgers.isEmpty();
    }

    public boolean isFull(){
        return burgers.size() >= capacity;
    }

    public synchronized Hamburger getBurger() throws InterruptedException {
        while(isEmpty()){
            try {
                this.wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

            Hamburger returner = burgers.poll();
            this.notifyAll();
            return returner;

    }

    public synchronized void addBurger(Hamburger burger) throws InterruptedException {
        while(isFull()){
            try {
                this.wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }


        burgers.offer(burger);
        this.notifyAll();
    }

    public int getLength(){
        return burgers.size();
    }



}
