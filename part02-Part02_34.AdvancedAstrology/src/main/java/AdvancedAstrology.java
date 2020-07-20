
public class AdvancedAstrology {

    public static void printStars(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSpaces(int number) {

        for (int i = 1; i <= number; i++) {
            System.out.print(" ");
        }

    }

    public static void printTriangle(int size) {
        // fourth part of the exercise

        for (int i = 1; i <= size; i++) {
            printSpaces(size - i);
            printStars(i);
        }

    }

    public static void christmasTree(int height) {
        int i = 1;
        int j = height - 1;
        while (i <= height * 2 && j >= 0) {
            printSpaces(j);
            printStars(i);
            i = i + 2;
            j--;
            if (j == -1) {
                printSpaces(height - 2);
                System.out.println("***");
                printSpaces(height - 2);
                System.out.println("***");
            }
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
