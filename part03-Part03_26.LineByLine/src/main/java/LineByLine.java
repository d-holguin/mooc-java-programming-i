
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            for (String e : splitStringArray) {
                System.out.println(e);
            }
            if (userInput.equals("")) {
                break;
            }

        }

    }
}
