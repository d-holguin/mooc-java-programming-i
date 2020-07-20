
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a year:");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        if(userInput % 4 == 0 && userInput % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (userInput % 100 == 0 && userInput % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }

    }
}
