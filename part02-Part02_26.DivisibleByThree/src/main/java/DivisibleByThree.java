
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int userInput1 = Integer.valueOf(scanner.nextLine());
         
        
        int userInput2 = Integer.valueOf(scanner.nextLine());
        
        divisibleByThreeInRange(userInput1 , userInput2);

    }

    public static void divisibleByThreeInRange(int beginning, int end){
        
       
        while(beginning <= end){
            if(beginning % 3 == 0){
                System.out.println(beginning);
            }
            beginning++;
        }
        
    }
    
    
}
