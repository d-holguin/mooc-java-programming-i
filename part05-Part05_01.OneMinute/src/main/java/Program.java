
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
       
        Timer timer = new Timer();
        
        

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(3);
            } catch (Exception e) {

            }
        }

    }
}
