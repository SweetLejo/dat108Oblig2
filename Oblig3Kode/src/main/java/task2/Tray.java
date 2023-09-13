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

    public synchronized Hamburger getBurger(){
        if(isEmpty()){
            return null;
        }
        return burgers.poll();
    }

    public synchronized void addBurger(Hamburger burger){
        if(isFull()){
            return;
        }
        burgers.offer(burger);
    }

    public int getLength(){
        return burgers.size();
    }



}
