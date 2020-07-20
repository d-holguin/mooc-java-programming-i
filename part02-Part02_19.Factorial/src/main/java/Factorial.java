
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
    int first = 5;
    int second = 10;
    
    beginningToMiddle(first, second);

    System.out.println(first);
}

public static void beginningToMiddle (int start, int end) {
    int middle = (start + end)/2;
    while (start < middle) {
        System.out.println("step");
        start++;
    }
}
}
