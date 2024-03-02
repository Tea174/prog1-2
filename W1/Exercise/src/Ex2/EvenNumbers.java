package Ex2;

import java.util.*;

public class EvenNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int RanNum = random.nextInt(49)+1;
            list.add(RanNum);

        }
        System.out.println("Random number between 1 and 50: ");
        for (int listnum : list) {
            System.out.print(listnum + " ");
        }
        System.out.println();
        System.out.println(list);
        Integer[] numberArray = list.toArray(new Integer[0]);
        System.out.println();
        //Copy the array to a new List evenNumbers
        List<Integer> myList = Arrays.asList(numberArray);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer oddNumber = iterator.next();
            if(oddNumber%2!=0) {
                iterator.remove();

            }

        }
        System.out.println("Remove all odd numbers from evenNumbers: ");
        for(Integer oddNumber : list) {
            System.out.print(oddNumber + " ");

        }
        System.out.println();
        //Sort the list ascending and print it out
        Collections.sort(list);
        System.out.println("Sort the list ascending: \n" + list);

        //Sort the list descending and print it out
        Collections.reverse(list);
        System.out.println("Sort the list descending: \n" + list);

        //Shuffle the list again and print it out
        Collections.shuffle(list);
        System.out.println("Shuffle the list again: \n" + list);

        //Print the number of times 48 appears in the list. Hint: use Collections.frequency
        int frequency = Collections.frequency(list, 48);
        System.out.println(48 + " appears " + frequency + " times.");


    }
}
