package Ex9;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Runner {
    public static void main(String[] args) {
//        Set<Girl> girls = new HashSet<>();
//        girls.add(new Girl("An", 20));
//        girls.add(new Girl("Bea", 20));
//        girls.add(new Girl("Bea", 25));
//        girls.add(new Girl("Diana", 25));
//        girls.add(new Girl("Zoë", 18));
//        girls.add(new Girl("Ekaterina", 18));
//        girls.add(new Girl("Bea", 20));

        List<Girl> girls = List.of(new Girl("An", 20),new Girl("Bea", 20),
                new Girl("Bea", 25), new Girl("Diana", 25),
                new Girl("Zoë", 18), new Girl("Ekaterina", 18),
                new Girl("Bea", 20));

        TreeSet<Girl> setGirls = new TreeSet<>(girls);

        System.out.printf("Set of %d girls: %s\n",setGirls.size(), setGirls);
        System.out.println("Last girl: " +setGirls.last());
        System.out.println("Girl before Diana: " + setGirls.lower(new Girl("Diana", 25)));
        System.out.println("Girl that would be after Dido (21): "+ setGirls.ceiling(new Girl("Dido", 21)));

    }
}
