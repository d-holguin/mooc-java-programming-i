
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args)throws IOException {

        Scanner userScanner = new Scanner(System.in);
        System.out.println("Which file shyould have its contents printed?");
        
        String fileName = userScanner.nextLine();
        
        
        try ( Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            while (fileScanner.hasNextLine()) {

                String row = fileScanner.nextLine();

                System.out.println(row);

            }

        } catch (Exception e) {

            System.out.println("Error:" + e.getMessage());
        }
    }
}
