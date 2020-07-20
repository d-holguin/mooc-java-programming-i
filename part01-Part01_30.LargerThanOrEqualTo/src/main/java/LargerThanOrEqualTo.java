
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int userInputNumber1 = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int userInputNumber2 = Integer.valueOf(scanner.nextLine());
        
        
        if (userInputNumber1 > userInputNumber2){
            System.out.println("Greater number is:" + userInputNumber1);
        
        } else if (userInputNumber1 < userInputNumber2){
            
            System.out.println("Greater number is:" + userInputNumber2);
        
        } else {
            
            System.out.println("The numbers are equal!");
        }
        
        

    }
}
