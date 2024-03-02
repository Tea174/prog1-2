import java.util.NoSuchElementException;

public class Data {
    private final static int MAX = 15;
    private final int[] numbers = new int[MAX];

    public Data() {
        for (int i = 0; i < MAX; i++) {
            numbers[i] = (i + 10);
        }
    }

    class Iterator {
        // implement your solution right here in this inner class.
        private int next = 0;
        public int getNext() {
            return next;
        }
        public boolean hasNext() {
            return next < numbers.length;
        }
        // method to get the next number from the 'numbers' array
        public int Next() {
            if(hasNext()) {
                return numbers[next++];
            }else {
                throw new NoSuchElementException("No more numbers");
            }
        }



    }
}