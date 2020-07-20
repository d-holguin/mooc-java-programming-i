
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
        int userInput2 = Integer.valueOf(scanner.nextLine());
        
        double result = Math.sqrt(userInput + userInput2);
        
        System.out.println(result);
        
        
        

    }
}
