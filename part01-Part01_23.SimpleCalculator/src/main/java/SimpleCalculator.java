
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scanner.nextLine());
        
        int additionAnswer = (firstNumber + secondNumber);
        
        int subtrationAnswer = (firstNumber - secondNumber);
        
        int multiplAnswer = (firstNumber * secondNumber);
        
        double divAnswer = 1.0 * firstNumber / secondNumber;
        
        
       
        
        System.out.println( firstNumber + " + " + secondNumber + " = " + additionAnswer);
        
        System.out.println( firstNumber + " - " + secondNumber + " = " + subtrationAnswer);
        
        System.out.println( firstNumber + " * " + secondNumber + " = " + multiplAnswer);
        
        System.out.println( firstNumber + " / " + secondNumber + " = " + divAnswer);
        
        
        
        
        
        
    }
}
