
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("First number?");

        int fromInput = Integer.valueOf(scanner.nextLine());

        System.out.print("Last number?");

        int toInput = Integer.valueOf(scanner.nextLine());

        int count = 0;

        while (fromInput <= toInput) {

            count += fromInput;

            fromInput++;

            System.out.println(fromInput);
        }
        System.out.println("The sum is " + count);

    }
}
