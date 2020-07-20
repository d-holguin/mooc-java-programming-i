
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int result = userInput * userInput;
        
        System.out.println(result);
        
        

    }
}
