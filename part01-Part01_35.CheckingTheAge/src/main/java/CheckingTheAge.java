
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How old are you?");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        if (userInput >= 0 && userInput <= 120) {
            System.out.println("Ok");
        } else {
            System.out.println("Impossible!");
        }

    }
}
