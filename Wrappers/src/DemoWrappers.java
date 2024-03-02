import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DemoWrappers {
    public static void main(String[] args) {
        // Integer number = 5; //không nên dùng, vì mất nhiều thời gian để chạy,
        ArrayList<Integer> someList = new ArrayList<>();
        ArrayList<Integer> someList1 = ;
                someList.add(5);
        someList.add(6);
        someList.add(2);
        someList.add(1, 10);
        System.out.println(someList);
        // for (int i = 1; i<someList.size(); i++) {
        //     if(i%2==1) {
        //        someList.remove(i);
        //it cannot be right cuz when it checks,

        // System.out.println(someList);
        int i = 0;
        for(Iterator<Integer> it = someList.iterator(); it.hasNext();){
            Integer currentNumber = it.next();
            System.out.println(currentNumber);
            if(i++%2==1);{
                it.remove();
            }
        }
        System.out.println(someList);

    int[] numberArray = new int[3];
    numberArray[0] = 13;
    numberArray[1] = 26;
    numberArray[2] = 80;
    Arrays.sort(numberArray);
        System.out.println(Arrays.toString(numberArray));

    }
}




