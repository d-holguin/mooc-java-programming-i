
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here -- consider breaking the program into 
        // multiple classes.
        GradeBook gradeBook = new GradeBook();

        TextInterface txtInterface = new TextInterface(scanner, gradeBook);
        txtInterface.start();
    }
}
