
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a string:");
        
        String strInput = scanner.nextLine();
        
        System.out.println("Give an integer:");
        
        int intInput = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give a double:");
        
        double doubInput = Double.valueOf(scanner.nextLine());
        
        System.out.println("Give a boolean:");
        
        boolean boolInput = Boolean.valueOf(scanner.nextLine());
        
        
        
        System.out.println("You gave the string " + strInput);
        System.out.println("You gave the integer " + intInput);
        System.out.println("You gave the double " + doubInput);
        System.out.println("You gave the boolean " + boolInput);
               
        
        

        // Write your program here

    }
}
