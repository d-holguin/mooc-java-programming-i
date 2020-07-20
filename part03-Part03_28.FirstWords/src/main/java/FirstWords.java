
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            System.out.println(splitStringArray[0]);

            if (userInput.equals("")) {
                break;
            }

        }

    }
}
