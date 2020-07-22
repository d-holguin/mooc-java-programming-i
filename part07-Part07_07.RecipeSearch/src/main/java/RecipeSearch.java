
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {
    //class for handles the file io and creating the objs from the file. 

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RecipeBook recipeList = new RecipeBook();

        System.out.print("File to read: ");

        String fileName = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {

            ArrayList<String> fileLines = new ArrayList<>(); //create arraylist of the lines of the file
              //arraylist for the ingredneits of a Recipe 

            while (fileScanner.hasNextLine()) { //keeps looping entil end of the file

                String line = fileScanner.nextLine();

                if (line.trim().isEmpty() || !fileScanner.hasNextLine()) {  //when it comes to a blank line or the end of the file it 
                    // stops and and starts assign the lines/ArrayList to variables 
                    String name = fileLines.get(0);                         // simply the first two as Name and Time and then the rest to another list called ingredient list
                    int time = Integer.valueOf(fileLines.get(1));
                     ArrayList<String> ingredientList = new ArrayList<>();     //didn';t look into it too much but i had issues moving this else where and emptying the list beleow
                        
                    for (int i = 2; i < fileLines.size(); i++) {   //starts ingrendents after the first two lines
                        ingredientList.add(fileLines.get(i));

                    }
                    recipeList.addRecipe(new Recipe(name, time, ingredientList));     // creates an object and adds it to the Recipebook object which is an arrayList of object
                                                                                      
                    fileLines.removeAll(fileLines);                                   
                                             
                } else {

                    fileLines.add(line);
                }

            }

            fileScanner.close();

        } catch (Exception e) {

            System.out.println("Error reading file " + e.getMessage());
        }

        TextInterface txtInterface = new TextInterface(scanner, recipeList);

        txtInterface.start();

    }

}
