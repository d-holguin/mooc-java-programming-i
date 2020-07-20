
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String inputTitle = scanner.nextLine();
            if (inputTitle.isEmpty()) {
                break;
            }

            System.out.println("Publication year: ");

            int inputPubYear = Integer.valueOf(scanner.nextLine());

            System.out.println("Pages: ");

            int inputPages = Integer.valueOf(scanner.nextLine());

            books.add(new Book(inputTitle, inputPages, inputPubYear));
        }

        System.out.println("What information will be printed? ");

        String whatToPrint = scanner.nextLine();

        if (whatToPrint.toLowerCase().equals("everything")) {
            for (Book element : books) {
                System.out.println(element);
            }
        }
        if (whatToPrint.toLowerCase().equals("name")) {
            for (Book element : books) {
                System.out.println(element.getTitle());
            }
            
        } else {
           return;
        }

    }
}
