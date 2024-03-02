package Ex3;

public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDrink("LaChouffe " + "€3,50");
        menu.addDrink("Coca Cola " + "€2,00");
        menu.addDrink("Spa Sparkling " + "€2,00");
        menu.addDrink("Spa Still " + "€2,00");
        menu.addDrink("Coca Cola Light " + "€2,00");
        menu.addDrink("Coffee " + "€2,50");
        menu.addDrink("Tea " + "€2,50");
        menu.addDrink("Pils " + "€2,00");
        menu.addDrink("Duvel " + "€3,50");
        menu.addDrink("Orval " + "€4,00");
        System.out.print(menu + " ");



    }
}
