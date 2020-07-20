import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name: ");
            String inputName = scanner.nextLine();
            if (inputName.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");

            int inputDuration = Integer.valueOf(scanner.nextLine());

           


            programs.add(new TelevisionProgram(inputName, inputDuration));
        }
        
        
        System.out.println("Program's maximum duration?");
        
        int inputMaxDuration = Integer.valueOf(scanner.nextLine());
        
        
        for(TelevisionProgram element: programs){
            
            
            if(element.getDuration() <= inputMaxDuration){
                System.out.println(element.getName() + ", "+ element.getDuration() +" minutes");
            }
                
        }
        
        
        
        

    }
}
