package Ex12;

import java.util.*;

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

//        Map<String,Girl> map = new HashMap<>();
//        for (Girl girl : girls) {
//            map.put(girl.getName(),girl);
//        }
//        System.out.println("Map size " + map.size());
//        System.out.println("Map of 5 girls: " + map);

        Map<String,Girl> Tree = new TreeMap<>();

        for (Girl girl : girls) {
           Tree.put(girl.getName(),girl);
       }
        System.out.println("Tree map: " + Tree);
     }
}
