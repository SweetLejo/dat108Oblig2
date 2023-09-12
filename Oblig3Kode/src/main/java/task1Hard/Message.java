package task1Hard;

public class Message {

    private String text;
    private boolean isRead;

    public String getText() {
        this.isRead = true;
        return text;
    }

    public void setText(String text){
        this.isRead = false;
        this.text = text;
    }

    public boolean isRead(){
        return isRead;
    }
}
