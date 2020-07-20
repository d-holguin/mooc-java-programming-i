
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());

    }
}
