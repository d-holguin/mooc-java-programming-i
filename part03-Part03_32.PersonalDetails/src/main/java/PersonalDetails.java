
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> userNames = new ArrayList<String>();

        ArrayList<Integer> userAges = new ArrayList<Integer>();

        while (true) {
            String userInput = scanner.nextLine().trim();

            if (userInput.length() > 0) {
                String[] splitStringArray = userInput.split(",");

                userNames.add(splitStringArray[0]);

                userAges.add(Integer.valueOf(splitStringArray[1]));
            }

            if (userInput.equals("")) {
                break;
            }

        }

        int sumOfBirthYears = 0;
        int numOfYears = 0;

        int longestString = userNames.get(0).length();
        int index = 0;

        for (int i = 0; i < userNames.size(); i++) {

            if (userNames.get(i).length() > longestString) {

                longestString = userNames.get(i).length();
                index = i;

            }
            sumOfBirthYears += userAges.get(i);
            numOfYears++;

        }
        double average = 1.0 * sumOfBirthYears / numOfYears;

        System.out.println("Longest name: " + userNames.get(index));

        System.out.println("Average of the birth years: " + average);
    }
}
