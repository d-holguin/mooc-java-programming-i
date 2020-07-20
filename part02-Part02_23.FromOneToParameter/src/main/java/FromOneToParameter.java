

public class FromOneToParameter {

    public static void main(String[] args) {
        
        printUntilNumber(2);
        
    }
    public static void printUntilNumber(int number){
        
        int index = 1;
        
        while (index <= number){
            System.out.println(index);
            index++;
        }
        
    }

}
