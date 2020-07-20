
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(2);
        list.add(6);

        printNumbersInRange(list, 1, 3);
    

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        for (int i = 0; i < numbers.size(); i++) {
            
            //the lower and upper limits are inclusive 
            if (numbers.get(i) >= lowerLimit && numbers.get(i) <= upperLimit) {
                
                System.out.println(numbers.get(i));

            }

        }

    }

}
