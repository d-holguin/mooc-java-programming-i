
import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here 
        
        System.out.println("How old are you?");
        int userInput = Integer.valueOf(scanner.nextLine());
        
        if (userInput >= 18){
            System.out.println("You are an adult");
            
        } else {
            System.out.println("You are not an adult");
        }
    }
}
