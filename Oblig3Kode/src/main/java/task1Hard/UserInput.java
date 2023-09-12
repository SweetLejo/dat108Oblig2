package task1Hard;

import javax.swing.*;

public class UserInput implements Runnable {

    private Message message;

    UserInput(Message message){
        this.message = message;
    }

    @Override
    public void run() {

        synchronized (message){
            while(!message.isRead()){
                try {
                    message.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            message.setText(JOptionPane.showInputDialog("bla"));
            message.notifyAll();
        }


    }
}
