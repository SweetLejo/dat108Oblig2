package task2;

public class Tray {

    private Hamburger[] burgers;
    public int current;


    public Tray(int capacity){
        this.burgers = new Hamburger[capacity];
        current = 0;
    }

    public Tray(){
        int DEFAULT_CAPACITY = 4;
        this.burgers = new Hamburger[DEFAULT_CAPACITY];
        current = 0;
    }

    private boolean isEmpty(){
        return current == 0;
    }

    private boolean isFull(){
        return current == burgers.length;
    }

    public synchronized Hamburger getBurger(){
        if(isEmpty()){
            return null;
        }
        Hamburger returner = burgers[current];
        burgers[current] = null;
        current--;
        return returner;
    }

    public synchronized void addBurger(Hamburger burger){
        if(isFull()){
            return;
        }
        current++;
        burgers[current] = burger;
    }







}
