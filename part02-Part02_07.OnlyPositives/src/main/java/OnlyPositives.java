
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");

        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());
            int result;

            if (userInput == 0) {

                break;

            } else if (userInput > 0) {
                
                result = userInput * userInput;
                System.out.println(result);
                System.out.println("Give a number:");
                
            } else if (userInput < 0) {
                
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
            }

        }
    }
}


