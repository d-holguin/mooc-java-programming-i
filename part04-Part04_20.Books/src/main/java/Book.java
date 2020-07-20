/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dantes
 */
public class Book {

    private String title;
    private int publicationYear;
    private int pages;

    public Book(String title, int publicationYear, int pages) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {

        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }

}
