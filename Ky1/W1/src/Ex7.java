import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float kg = 0;
        float meters = 0;
//        float BMI = kg/meters;
        System.out.println("Dear patient, this programma will calculate your BMI.");
        System.out.println("Enter your weight in kilograms: ");
        kg = scanner.nextFloat();
        System.out.println("Enter your length in meters: ");
        meters = scanner.nextFloat();
        System.out.println("Your BMI is: ");
        System.out.println(kg/(meters*meters));

        if(kg/(meters*meters) < 18) {
            System.out.println("underweight");
        }else if(kg/(meters*meters) >= 18 || kg/(meters*meters) < 25 ) {
            System.out.println("healthy weight");
        } else if(kg/(meters*meters) >= 25 || kg/(meters*meters)< 30){
            System.out.println("overweight");
        } else if (kg/(meters*meters) >= 30 ) {
            System.out.println("obese");
        }



    }
}
