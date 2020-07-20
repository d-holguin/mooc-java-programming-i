
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int result = 0;
        int count = 0;
        double average = 0;
        
        while (true) {

            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput == 0) {
                
                if(count == 0){
                    
                    System.out.println("Cannot calculate the average");
                    
                } else {
                    
                    average =  1.0 * result / count;
                    System.out.println("Average of the numbers: " + average);
                }
               
                
                break;

            } else {
                
                if (userInput > 0){
                    count += 1;
                    result += userInput;
                }
                
                
                
                System.out.println("Give a number:");
            }

        }

    }
}
