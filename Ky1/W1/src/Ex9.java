import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the first number (1..100):");
        a = scanner.nextInt();
        System.out.println("Enter the second number (1..100):");
        b = scanner.nextInt();
        System.out.println("Enter the third number (1..100):");
        c = scanner.nextInt();
        if(a > b || a < c) {
            System.out.println("The middle number is " + a);
        }
         else if(a < b || a> c ) {
            System.out.println("The middle number is " + a);
        }
        else if(b > a || b < c) {
            System.out.println("The middle number is " + b);
        }
        else if(b < a || b > c ) {
            System.out.println("The middle number is " + b);
        }
        else if(c > b || c < a) {
            System.out.println("The middle number is " + c);
        }
        else if(c < b || c > a ) {
            System.out.println("The middle number is " + c);
        }
    }
}
