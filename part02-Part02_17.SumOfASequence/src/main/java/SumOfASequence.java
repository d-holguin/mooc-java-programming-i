
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Last number?");
        
        int input = Integer.valueOf(scanner.nextLine());
        
        
        
       
        
        int index = 0;
        int count = 0;
        
        while(index <= input) {
            
            count += index;
            
           
            index++;
            
            
        }
        System.out.println("The sum is " + count);
        

    }
}
