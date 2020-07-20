/*
 * This program is
 * 
 */

/**
 *
 * @author Dantes
 */
public class Film {

    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRatting) {
        this.name = filmName;
        this.ageRating = filmAgeRatting;
    }

    public String name() {
        return this.name;
    }

    public int ageRating() {
        return this.ageRating;
    }
}
