public class Runner {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addDrink(new Drink("La Chouffe", 3.50, true));
        menu.addDrink(new Drink("Coca Cola", 2.00, false));
        menu.addDrink(new Drink("Pepsi", 2.00, false));
        menu.addDrink(new Drink("Leffe Blonde", 3.75, true));
        menu.addDrink(new Drink("Water", 1.50, false));
        menu.addDrink(new Drink("Juice", 2.50, false));
        menu.addDrink(new Drink("Stella Artois", 3.00, true));
        menu.addDrink(new Drink("Duvel", 3.80, true));
        menu.addDrink(new Drink("Hoegaarden", 3.00, true));
        menu.addDrink(new Drink("Sprite", 2.00, false));
        System.out.println("Our menu contains " + menu.getSize() + " drinks, with a total cost of €" + menu.getTotalPrice());
        System.out.println("Menu: ");
        System.out.print(menu);
        System.out.println();
        System.out.print("The most expensive drink: " + menu.mostExpensiveDrink());
        System.out.println();
        System.out.println("Menu without drinks above €3: " );
        menu.removeMoreExpensiveThen();
        System.out.println(menu);

        Drink[] newArrivals = {new Drink("Bushmills 10yr",7,true),new Drink("SpringBank 5yr", 5,true)};
        menu.addDrinks(newArrivals);
        System.out.println("Extended menu: ");
        System.out.print(newArrivals);



    }
}