
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
public class TextUI {

    private Scanner scanner;
    private BirdDatabase birdlist;

    public TextUI(Scanner scanner, BirdDatabase birdlist) {
        this.scanner = scanner;
        this.birdlist = birdlist;
    }

    public void start() {

        {

            boolean shouldLoop = true;

            try {

                while (shouldLoop) {
                    System.out.print("? ");
                    //switch statments seem much eaiser to read imo

                    String command = scanner.nextLine();

                    switch (command.toLowerCase()) {
                        case "quit":

                            shouldLoop = false;
                            break;
                        case "add":
                            System.out.print("Name ");
                            String name = scanner.nextLine();
                            
                            System.out.print("Name in Latin ");
                            String latinName = scanner.nextLine();

                            birdlist.addBird(new Bird(name, latinName));

                            break;
                        case "observation":

                            name = scanner.nextLine();

                            birdlist.addObservationFromDB(name);

                            break;
                        case "all":
                            birdlist.printBirdDatabase();

                            break;
                        case "one":
                            name = scanner.nextLine();

                            birdlist.printBird(name);

                            break;
                        default:
                            System.out.println("Unknown command");

                    }

                }

                //shouldn't just catch all exceptions
            } catch (Exception error) {
                System.out.println("There was an error msg is " + error.getMessage());

            }

        }

    }

}
