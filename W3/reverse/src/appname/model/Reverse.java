package appname.model;

public class Reverse {
// private attributes
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Reverse(String text) {
        this.text = text;
    }

    public StringBuilder ReverseWords() {
        StringBuilder input = new StringBuilder();
        input.append(text);
        return input.reverse();
    }

    public Reverse() {
        // Constructor
    }

    // methods with business logic

    // necessary getters and setters

}
