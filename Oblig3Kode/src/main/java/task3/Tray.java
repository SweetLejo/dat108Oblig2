package task3;

import task2.Hamburger;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Tray {

    private BlockingQueue<Hamburger> burgers;
    private int capacity;

    public Tray(){
        burgers = new LinkedBlockingDeque<>(4);
        this.capacity = 4;
    }
    public Tray(int size){
        burgers = new LinkedBlockingDeque<>(size);
        this.capacity = size;
    }

    public boolean isFull(){
        return burgers.size() >= capacity;
    }

    public boolean isEmpty(){
        return burgers.isEmpty();
    }

    public void addBurger(Hamburger burger){
        try{
            burgers.put(burger);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    public Hamburger getBurger(){
        try{
            return burgers.take();
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            return null;
        }
    }

    public int getLength(){
        return this.capacity;
    }




}
