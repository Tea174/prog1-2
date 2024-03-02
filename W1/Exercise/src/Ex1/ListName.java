package Ex1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListName {
    public static void main(String[] args) {
        //Make a List and add 5 names (Strings) to it: Albert, Henry, Josephine, Annabelle and Ashraf
        List<String> listName = new ArrayList<>();
        listName.add("Albert");
        listName.add("Josephine");
        listName.add("Annabelle");
        listName.add("Ashraf");
        //String[] myArray = {, "Henry", "Josephine", "Annabelle", "Ashraf"};
        //Print out the first and last name in the list
        System.out.println(listName.get(0));
        //System.out.println(listName.get(listName.lastIndexOf(listName)));

        //Print all names, using a for-each loop
        for(String word: listName){
            System.out.println(word);
        }
        //Check if the name "Georgie" is present in the list and print out the result of the test
        System.out.println(listName.contains("Georgie"));
        //Remove all names starting with A from the list
        Iterator<String> iterator = listName.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if(name.startsWith("A")) {
                iterator.remove();
            }

        }
        System.out.println("Name left: ");
        for (String name : listName) {
            System.out.println(name);
        }



    }
}
