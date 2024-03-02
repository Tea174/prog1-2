import java.util.*;

public class numberList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> evenNumbers = new ArrayList<>();
        System.out.println("20 random numbers between 1 and 50 (both inclusive): ");
        //Print the list
        for (int i = 0; i < 20; i++) {
            evenNumbers.add(random.nextInt(50) + 1 );
        }
        System.out.println(evenNumbers);

        //Copy the list to an array numberArray
        Integer[] array = evenNumbers.toArray(new Integer[0]);
        //Print the array using a for-each loop
        System.out.println("Print the array using a for-each loop: " );
        for (Integer numberArray: array) {
            System.out.print( numberArray + " ");
        }
        System.out.println();

        //Copy the array to a new List evenNumbers
        List<Integer> newList = Arrays.asList(array);

        //Remove all odd numbers from evenNumbers.
        System.out.println("Remove all odd numbers from evenNumbers: ");
        Iterator<Integer> iterator = evenNumbers.iterator();
        while (iterator.hasNext()) {
            Integer i = iterator.next();
            if(i%2!=0){
                iterator.remove();
            }
        }
        for (Integer i: evenNumbers) {
            System.out.print(i + " ");
        }


    }
}
