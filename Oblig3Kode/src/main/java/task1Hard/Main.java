package task1Hard;

public class Main {
    public static void main(String[] args){

        Message message = new Message();



        Thread print3Sec = new Thread(new printEvery3Seconds(message));
        Thread usrInput = new Thread(new UserInput(message));


        usrInput.start();
        print3Sec.start();


    }



}
