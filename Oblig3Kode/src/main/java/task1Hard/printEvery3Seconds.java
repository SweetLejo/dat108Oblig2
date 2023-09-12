package task1Hard;

public class printEvery3Seconds implements Runnable {

    private Message message;

    printEvery3Seconds(Message message){
        this.message = message;
    }


    @Override
    public void run() {
        while( !"quit".equalsIgnoreCase(message.getText()) ){

            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            synchronized (message) {
                while (!message.isRead()) {
                    try {
                        message.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }


            System.out.println(message.getText());

        }
    }

}
