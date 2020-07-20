
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int userInput1 = Integer.valueOf(scanner.nextLine());
        
        
        int userInput2 = Integer.valueOf(scanner.nextLine());
        
        if(userInput1 > userInput2){
            System.out.println(userInput1 + " is greater than " + userInput2);
        } else if (userInput1 == userInput2){
            
            System.out.println(userInput1 + " is equal to " + userInput2);
            
        } else {
            System.out.println(userInput1 + " is smaller than " + userInput2);
        }
        

    }
}
