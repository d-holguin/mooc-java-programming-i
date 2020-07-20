
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers");

        Statistics userStats = new Statistics();
        Statistics userEvenStats = new Statistics();
        Statistics userOddStats = new Statistics();
        

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == -1) {

                System.out.println("Sum: " + userStats.sum());
                System.out.println("Sum of even numbers: " + userEvenStats.sum());
                System.out.println("Sum of odd numbers: " + userOddStats.sum());

                break;
            } else {
                
                userStats.addNumber(userInput);
                if(userInput % 2 == 0 ){
                    userEvenStats.addNumber(userInput);
                } else {
                    userOddStats.addNumber(userInput);
                }
                        
                
                
                
                System.out.println("Enter numbers");

            }

        }

        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise
        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
