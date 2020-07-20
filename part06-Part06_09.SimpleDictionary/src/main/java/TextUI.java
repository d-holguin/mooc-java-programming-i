
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

    private SimpleDictionary simpleDict;

    public TextUI(Scanner scanner, SimpleDictionary simpleDict) {
        this.scanner = scanner;
        this.simpleDict = simpleDict;
    }

    public void start() {
        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Command: ");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "end":
                    System.out.println("Bye bye!");
                    shouldLoop = false;
                    break;
                case "add":
                    //ask for word
                    System.out.println("Word");
                    String wordInput = scanner.nextLine();
                    //ask for its translation
                    System.out.println("Translation");
                    String translationInput = scanner.nextLine();

                    //add it to the diction simpleDict
                    simpleDict.add(wordInput, translationInput);
                    break;
                case "search":
                    System.out.println("To be translated");
                    String wordToTranslate = scanner.nextLine();
                    
                    if (simpleDict.translate(wordToTranslate) == null) {
                        System.out.println("Word " + wordToTranslate + " was not found");
                    } else {
                        System.out.println(simpleDict.translate(wordToTranslate));
                    }

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}

//            if (userInput.equals("end")) {
//                System.out.println("Bye bye!");
//                break;
//            } else {
//                (
//            }
//            if ) {
//                else {
//                System.out.println("Unknown command");
//            }
//            }
