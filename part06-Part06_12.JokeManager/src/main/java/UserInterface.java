
import java.util.Scanner;

/*
 * Copyright (C) 2020 Dantes
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
/**
 *
 * @author Dantes
 */
public class UserInterface {

    private JokeManager jManager; //joke manager
    private Scanner scanner;

    public UserInterface(JokeManager jManger, Scanner scanner) {
        this.jManager = jManger;
        this.scanner = scanner;
    }

    public void start() {

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "X":
                    shouldLoop = false;
                    break;
                case "1":

                    System.out.print("Write the joke to be added:");
                    String jokeToAdd = scanner.nextLine();
                    //adds joke to jokemanager / array list
                    jManager.addJoke(jokeToAdd);

                    break;
                case "2":
                    System.out.println(jManager.drawJoke());

                    break;
                case "3":
                    jManager.printJokes();

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}
