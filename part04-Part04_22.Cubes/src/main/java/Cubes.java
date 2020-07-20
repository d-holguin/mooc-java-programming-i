
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
           while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }
            int userInputToInt = Integer.valueOf(userInput);
            
            int result = (userInputToInt * userInputToInt) * userInputToInt;
            
               System.out.println(result);
            
            // add the read line to a list for later
            // handling or handle the line immediately
        }

    }
}
