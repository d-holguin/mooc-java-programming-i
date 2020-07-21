
import java.util.Scanner;

public class LiquidContainers {
    //this is pretty messy btw but works

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstContainer = 0;
        int secondContainer = 0;

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print(
                    "First: " + firstContainer + "/100\n"
                    + "Second: " + secondContainer + "/100 \n");

            String userInput = scanner.nextLine();
            if (userInput.equals("quit")) {
                shouldLoop = false;
                break;
            }

            String[] userInputSplit = userInput.split(" ");

            String command = userInputSplit[0];

            int amount = Integer.valueOf(userInputSplit[1]);

            switch (command) {
                case "add":

                    if (amount <= 0) {
                        return;
                    }

                    if (firstContainer + amount <= 100) {

                        firstContainer += amount;
                    } else if (firstContainer + amount > 100) {
                        firstContainer = 100;
                    }

                    break;
                case "move":

                    if (amount <= 0 || firstContainer == 0) {
                        return;
                    }

                    if (firstContainer - amount < 0) {
                        amount = firstContainer;
                    }

                    if (amount >= 100) {
                        firstContainer = 0;
                        secondContainer = 100;

                    } else if (secondContainer + amount <= 100) {
                        secondContainer += amount;
                        firstContainer -= amount;
                    } else if (amount + secondContainer > 100 && amount + firstContainer > 100) {

                        secondContainer = 100;

                        firstContainer = 0;
                    }

                    break;
                case "remove":

                    if (amount <= 0) {
                        return;
                    }

                    if (amount > secondContainer) {
                        amount = 0;
                    } else {
                        secondContainer -= amount;
                    }

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }
    }
}
//
//    public void addAmount(int amount) {
//        //adds liquid to container 1
//        if (firstContainer + amount <= 100) {
//
//            firstContainer += amount;
//        } else if (firstContainer + amount > 100) {
//            firstContainer = 100;
//        }
//
//    }
//
//    public void moveAmount(int amount) {
//        //moves liquid from continer 1 to container 2
//        if (amount > firstContainer) {
//            amount = firstContainer;
//
//        } else if (secondContainer + amount <= 100) {
//            secondContainer += amount;
//        } else if (secondContainer + amount > 100) {
//            secondContainer = 100;
//        }
//
//    }
//
//    public void removeAmount(int amount) {
//        if (amount > secondContainer) {
//            amount = 0;
//        } else {
//            secondContainer -= amount;
//        }
//
//    }

//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }
//
//        }

