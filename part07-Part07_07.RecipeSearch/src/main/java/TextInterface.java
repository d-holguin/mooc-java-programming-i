
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
public class TextInterface {

    private Scanner scanner;
    private RecipeBook recipeList;

    public TextInterface(Scanner scanner, RecipeBook recipes) {
        this.scanner = scanner;
        this.recipeList = recipes;
    }

    public void start() {

        boolean shouldLoop = true;

        System.out.println("Commands:" + "\n"
                + "list - list the recipes\n"
                + "stop - stops the program\n"
                + "find name - searches recipes by name\n"
                + "find cooking time - searches recipes by cooking time\n"
                + "find ingredient - searches recipes by ingredient");

        while (shouldLoop) {
            System.out.print("Enter command: ");
            //switch statments seem much eaiser to read
            String command = scanner.nextLine();

            switch (command) {
                case "stop":

                    shouldLoop = false;
                    break;
                case "list":
                    System.out.println("Recipes:");
                    recipeList.printRecipeBook();

                    break;
                case "find name":
                    System.out.print("Search word: ");
                    String searchWord = scanner.nextLine();

                    recipeList.printByName(searchWord);

                    break;
                case "find cooking time":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByTime(searchWord);

                    break;
                case "find ingredient":
                    System.out.print("Search word: ");
                    searchWord = scanner.nextLine();

                    recipeList.printByIngredient(searchWord);

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}
