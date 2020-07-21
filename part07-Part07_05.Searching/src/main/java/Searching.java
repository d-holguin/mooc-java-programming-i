
import java.util.ArrayList;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        int index = 0;
        int foundIndex = -1;

        for (Book e : books) {

            if (e.getId() == searchedId) {

                foundIndex = index;
            }

            index++;
        }

        return foundIndex;
    }
    // use help from here https://github.com/TheAlgorithms/Java/blob/master/Searches/BinarySearch.java

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        //indexes

        int first = 0;
        int last = books.size() - 1;

        int foundIndex = -1;

//break statement is very important otherqise it just keeps looping infinitely 
//or you could just use return. I find 1 return statment a bit easier to read 
        while (first <= last) {

            int middle = (first + last) / 2;

            if (books.get(middle).getId() == searchedId) {

                foundIndex = middle;
                break;
            } else if (books.get(middle).getId() < searchedId) {
                first = middle + 1;
            } else if (books.get(middle).getId() > searchedId) {
                last = middle - 1;
            }

        }

        return foundIndex;

    }
}
