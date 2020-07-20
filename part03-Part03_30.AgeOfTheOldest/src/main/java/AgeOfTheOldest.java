
import java.util.ArrayList;
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<String>();

        ArrayList<Integer> userAges = new ArrayList<Integer>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.length() > 0) {
                String[] splitStringArray = userInput.split(",");

                

                userNames.add(splitStringArray[0]);

                userAges.add(Integer.parseInt(splitStringArray[1]));
            }

            if (userInput.equals("")) {
                break;
            }

        }
        

        int largest = userAges.get(0);

        for (int i = 0; i < userAges.size(); i++) {
            int number = userAges.get(i);
            if (largest < number) {
                //largest = number;
                largest = userAges.get(i);
               
                
                
            }

        }

        System.out.println("Age of the oldest: " + largest);
    }
}
