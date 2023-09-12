package task2;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> chefs = Arrays.asList("bob", "Lars");
        List<String> waitors = Arrays.asList("Pelle", "Karl");
        Tray tray = new Tray();
        chefs.stream()
                .map(a -> new Thread( new Chef(a, tray)))
                .forEach(Thread::start);
        waitors.stream()
                .map(a -> new Thread(new Waiter(a, tray)))
                .forEach(Thread::start);
    }

}
