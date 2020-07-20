
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int thirdNumber = Integer.valueOf(scanner.nextLine());
        
        Double answer = 1.0 * (firstNumber + secondNumber + thirdNumber) / 3;
        
        System.out.println( "The average is " + answer);

    }
}
