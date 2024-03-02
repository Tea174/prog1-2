import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Names {
    public static void main(String[] args) {
        List<String> ListNames = new ArrayList<>(List.of("Albert", "Henry", "Josephine", "Annabelle", "Ashraf"));

        //print 1st name
        System.out.println("1st name of the list: " + ListNames.get(0));
        //print last name
        System.out.println("Last name of the list: " + ListNames.get(ListNames.size() - 1));
        //print all names
        System.out.print("All names: ");
        for (String list : ListNames) {
            System.out.print(list + " ");
        }

        //Check if the name "Georgie" is present in the list
        System.out.println();
        System.out.println("Check if the name \"Georgie\" is present in the list: " + ListNames.contains("Georgie"));
//        if(List.of().contains("Georgie")) {
//            System.out.println("Georgie is present.");
//        } -> did not work

        //Remove all names starting with A from the list
        Iterator<String> iterator = ListNames.iterator();
        while (iterator.hasNext()) {
            if(iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        //Print out the list, by simply passing it to a print statement.
        System.out.print("Names after being deleted: ");
        System.out.print(ListNames);




    }


}

