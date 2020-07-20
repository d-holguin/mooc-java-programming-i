
import java.util.ArrayList;
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<String>();

        ArrayList<Integer> userAges = new ArrayList<Integer>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.length() > 0) {
                String[] splitStringArray = userInput.split(",");

                

                userNames.add(splitStringArray[0]);

                userAges.add(Integer.valueOf(splitStringArray[1]));
            }

            if (userInput.equals("")) {
                break;
            }

        }
        

        int largest = userAges.get(0);
        
        String oldestPerson = userNames.get(0);
        
       

        for (int i = 0; i < userAges.size(); i++) {
            int number = userAges.get(i);
            if (largest < number) {
                //largest = number;
                oldestPerson = userNames.get(i);
                
                
                
            }

        }

        System.out.println("Name of the oldest: " + oldestPerson);
    }
}
