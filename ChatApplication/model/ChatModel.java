package ChatApplication.model;

import java.util.ArrayList;
import java.util.List;

public class ChatModel {
// private attributes
    private List<String> messages;

    public ChatModel(){
        this.messages = new ArrayList<>();
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addMessage(String message){
        messages.add(message);
    }
}