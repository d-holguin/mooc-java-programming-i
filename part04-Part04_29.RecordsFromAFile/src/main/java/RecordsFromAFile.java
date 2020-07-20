
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String file = scanner.nextLine();

        try ( Scanner fileScanner = new Scanner(Paths.get(file))) {

            while (fileScanner.hasNextLine()) {

                String[] splitString = fileScanner.nextLine().split(",");

                if (splitString.equals("")) {
                    continue;
                }
                String name = splitString[0];

                int age = Integer.valueOf(splitString[1]);

                if (age > 1 || age == 0) {
                    System.out.println(name + ", age: " + age + " years");   //if they are older than 1 or 0 USES YEARS
                } else {
                    System.out.println(name + ", age: " + age + " year");
                }

            }

        } catch (Exception e) {

            System.out.println("File was not able to be read" + e.getMessage());
        }

    }
}
