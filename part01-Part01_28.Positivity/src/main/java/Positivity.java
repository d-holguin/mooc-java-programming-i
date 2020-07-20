
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a number:");
        
        int userInput = Integer.valueOf(scanner.nextLine());
        
      
        
        if(userInput > 0){
            System.out.println("The number is positive.");
           
        } else {
            
            System.out.println("The number is not positive.");
        }
        
        
        
    }
}
