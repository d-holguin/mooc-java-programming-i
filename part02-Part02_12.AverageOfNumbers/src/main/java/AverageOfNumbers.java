
import java.util.Scanner;

public class AverageOfNumbers {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int result = 0;
        int count = 0;
        double average = 0;
        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                
                System.out.println("Average of the numbers: " + average);
                
                break;

            } else {
                count += 1;
                result += userInput;
                average =  1.0 * result / count;
                System.out.println("Give a number:");
            }

        }

    }
}
