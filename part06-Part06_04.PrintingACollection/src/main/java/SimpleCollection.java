
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {

        String stringOutput = "";

        String listOfElements = "";

        
        // if its last or only elements don't use  line break otherwise do
        for (String e : elements) {

            if (e.equals(elements.get(elements.size() - 1))) {
                listOfElements += e;
            } else {
                listOfElements += e + "\n";
            }

        }

        if (elements.size() == 1) {
            stringOutput = "The collection " + this.name + " has 1 element:\n" + listOfElements;
        } else if (elements.size() == 0) {
            stringOutput = "The collection " + this.name + " is empty.";

        } else {

            stringOutput = "The collection " + this.name + " has " + elements.size() + " elements:\n" + listOfElements;

        }

        return stringOutput;
    }

}
