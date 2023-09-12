package task1Easy;

import javax.swing.*;
import java.util.function.Predicate;

public class Main {
    static String message = "";
    static Predicate<String> wannaQuit = (a) -> a.equalsIgnoreCase("quit");
    public static void main(String[] args){
        new Thread(Main::getMessage).start();
        new Thread(Main::askForMessage).start();
    }

    public static void askForMessage(){
        while (!wannaQuit.test(message)){
            message = JOptionPane.showInputDialog("what do you wanna say?");
        }
    }

    public static void getMessage(){
        while(!wannaQuit.test(message)){

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(message);
        }
    }

}
