
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdDataList = new BirdDatabase();
        
        TextUI  userInterfacse = new TextUI(scanner, birdDataList);
        
        //starts the userinterface
        userInterfacse.start();

    }

}
