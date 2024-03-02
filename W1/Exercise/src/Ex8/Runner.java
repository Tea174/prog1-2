package Ex8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Runner {
    public static void main(String[] args) {
        Set<Girl> girls = new HashSet<>();
        girls.add(new Girl("An", 20));
        girls.add(new Girl("Bea", 20));
        girls.add(new Girl("Bea", 25));
        girls.add(new Girl("Diana", 25));
        girls.add(new Girl("Zoë", 18));
        girls.add(new Girl("Ekaterina", 18));
        girls.add(new Girl("Bea", 20));

        HashSet<Girl> girlHashSet = new HashSet<>(girls);

        for (Girl girl: girlHashSet ) {
            System.out.print(girl + " ,");
        }

    }
}
