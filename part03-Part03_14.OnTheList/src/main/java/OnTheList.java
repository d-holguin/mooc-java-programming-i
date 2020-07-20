
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.println("Search for?");
        String userSearch = scanner.nextLine();
        boolean isFound = false;

        for (String e : list) {
            if (e.equals(userSearch)) {
                isFound = true;

            }

        }
        if (isFound) {
            System.out.println(userSearch + " was found!");

        } else {
            System.out.println(userSearch + " was not found!");

        }

    }
}
