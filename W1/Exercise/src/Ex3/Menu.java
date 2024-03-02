package Ex3;

import java.util.ArrayList;

public class Menu {
    private ArrayList<String> listOfDrinks;

    public Menu(ArrayList<String> listOfDrinks) {
        super();
        this.listOfDrinks = listOfDrinks;
    }
    public Menu() {
        this.listOfDrinks = new ArrayList<>();
    }
    //Add a method addDrink.
    public void addDrink (String drink) {
        this.listOfDrinks.add(drink);
    }
    public void getSize (Integer size) {
    }

    @Override
    public String toString() {
        return "Menu: "  + listOfDrinks;
    }
}
