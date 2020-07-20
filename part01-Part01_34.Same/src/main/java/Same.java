
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here.
        
        System.out.println("Enter the first string");
        String userInput = scanner.nextLine();
        
        String userInput2 = scanner.nextLine();
        
        if(userInput.equals(userInput2)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
        
        
    }
}
