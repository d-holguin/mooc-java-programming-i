
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            
            //System.out.print("Name: ");
            String itemInput = scanner.nextLine();
            
            items.add(new Item(itemInput));
            
            if (itemInput.isEmpty()) {
                
                for(Item e: items) {
                
                System.out.println(e);
            }
                
                break;
            }

        }
    }
}