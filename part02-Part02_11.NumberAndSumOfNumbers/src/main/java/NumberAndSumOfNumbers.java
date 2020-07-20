
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int result = 0;
        int count = 0;
        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: " + result);
                break;

            } else {
                count += 1;
                result += userInput;
                System.out.println("Give a number:");
            }

        }

    }
}
