package task3;


import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){


        //wanna put the wait and notifyAll in the chef and waiter class not the tray class
        //tray class gotta have syncronized methods to stop a race condition
        List<String> chefs = Arrays.asList("Bob", "Lars");
        List<String> waitors = Arrays.asList("Pelle", "Karl", "Peter", "Kalle");
        Tray tray = new Tray();
        chefs.stream()
                .map(a -> new Thread( new Chef(a, tray)))
                .forEach(Thread::start);
        waitors.stream()
                .map(a -> new Thread(new Waiter(a, tray)))
                .forEach(Thread::start);

    }
}
