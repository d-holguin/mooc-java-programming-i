
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("First name: ");
            String userFirstName = scanner.nextLine();
            if (userFirstName.isEmpty()) {
                break;
            }

            System.out.println("Last name: ");

            String userLastName = scanner.nextLine();

            System.out.println("Identificationm number: ");

            String userId = scanner.nextLine();

            // We add a new person to the list.
            // The person's name and age were decided by the user
            infoCollection.add(new PersonalInformation(userFirstName, userLastName, userId));
        }

        for (PersonalInformation e : infoCollection) {
            System.out.println(e.getFirstName() + " " + e.getLastName());
        }

    }
}
