
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            count++;
            // add the read line to a list for later
            // handling or handle the line immediately
        }
        System.out.println(count);

    }
}
