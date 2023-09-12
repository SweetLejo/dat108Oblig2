package task1Easy;

import javax.swing.*;

public class Main {
    static String message = "";
    public static void main(String[] args){
        new Thread(Main::getMessage).start();
        new Thread(Main::askForMessage).start();
    }

    public static void askForMessage(){
        while (continues()){
            message = JOptionPane.showInputDialog("what do you wanna say?");
        }
    }

    public static void getMessage(){
        while(continues()){

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(message);
        }
    }

    public static boolean continues(){
        return !message.equalsIgnoreCase("quit");
    }

}
