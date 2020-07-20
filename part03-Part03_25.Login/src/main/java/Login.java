
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] usersArray = {"alex", "emma"};
        
        String[] passwordsArray = {"sunshine", "haskell"};
        
        System.out.println("Enter username:");
        
        
        
        String usernameInput = scanner.nextLine();
        
        System.out.println("Enter password");
        
        String passwordInput = scanner.nextLine();
        
        
        boolean isValid = false;
        
        for(int i =0; i < usersArray.length; i++){
            if(usersArray[i].equals(usernameInput) && passwordsArray[i].equals(passwordInput)){
                isValid = true;
            }
            
        }
        if(isValid){
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        
        

    }
}
