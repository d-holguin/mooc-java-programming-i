
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String userInput = scanner.nextLine();

            String[] splitStringArray = userInput.split(" ");

            for (String e : splitStringArray) {
                if(e.contains("av")){
                    System.out.println(e);
                }
                        
            }
            if (userInput.equals("")) {
                break;
            }

        }


    }
}
