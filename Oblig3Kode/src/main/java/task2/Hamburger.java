package task2;

public class Hamburger {

    private static int count = 0;
    private final int id;

    public Hamburger(){
        id = count++;
    }

    public int getId(){
        return this.id;
    }
}
