
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Where to?");
        
        int toInput = Integer.valueOf(scanner.nextLine());
        
        System.out.print("Where from");
        
        int fromInput = Integer.valueOf(scanner.nextLine());
        
       
        
        
        
        while(fromInput <= toInput) {
            
            System.out.println(fromInput);
            fromInput++;
        }
        
        

    }
}
