
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
    }

    
    public static int sum(ArrayList<Integer> numbers){
        
        int result = 0;
        for(int e: numbers){
            result += e;
        }
    
        return result;
    }
}
