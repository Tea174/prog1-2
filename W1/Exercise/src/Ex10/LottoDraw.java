package Ex10;

import java.util.Random;
import java.util.TreeSet;

public class LottoDraw {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        Random random = new Random();
        do {
            numbers.add(random.nextInt(45) + 1);
        } while (numbers.size() < 6);
        System.out.print("The lotto numbers for today are: ");
        for (Integer numher: numbers) {
            System.out.print(numher + " ");
        }

    }

}
