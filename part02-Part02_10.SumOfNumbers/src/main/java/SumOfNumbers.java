
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Give a number:");
        int result = 0;
        
        while(true){
            
            int userInput = Integer.valueOf(scanner.nextLine());
            
            if(userInput == 0 ) {
                 
                System.out.println("Sum of the numbers: " + result);
                break;
                
            } else {
                result += userInput;
                System.out.println("Give a number:");
            }
           
        }
        
        
        
        

    }
}
