
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        
        System.out.println("Carry on?");
        while(true){
            
            String userInput = scanner.nextLine();
            
            if(userInput.equals("no")){
                
                break;
                
            } else {
                
                System.out.println("Carry on?");
            }
            
        }
    }
}
