package Ex6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Brands {
    private ArrayList<String> brand;

    public Brands() {
        this.brand = new ArrayList<>(Arrays.asList(Data.brands));
    }

    public void alphabetic() {
        Collections.sort(brand);
        System.out.println("Order by Alphabet: ");
    }

    public void alphabeticDescending() {
        Collections.reverse(brand);
       System.out.println("Reverse: " );
    }

    @Override
    public String toString() {
        return "Brands{" +
                "brand=" + brand +
                '}';
    }
}
