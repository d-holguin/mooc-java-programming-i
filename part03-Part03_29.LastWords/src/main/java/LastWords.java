
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            System.out.println(splitStringArray[splitStringArray.length - 1]);

            if (userInput.equals("")) {
                break;
            }

        }
    }
}
