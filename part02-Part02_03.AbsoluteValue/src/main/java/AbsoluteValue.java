
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Value of the gift?");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int result;
        
        if (userInput < 0 ) {
            result = userInput * -1;
            System.out.println(result);
        } else {
            System.out.println(userInput);
        }

    }
}
