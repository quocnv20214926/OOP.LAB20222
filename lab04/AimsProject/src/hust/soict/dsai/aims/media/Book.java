package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    // private int id;
    // private String title;
    // private String category;
    // private float cost;
    private int ctLength;
    private List<String> authors = new ArrayList<String>();

    public Book(String title, String category, int ctLength, float cost) {
        super(title, category, cost);
        this.ctLength = ctLength;

    }

    public Book(String title, String category, float cost) {
        super(title, category, cost);

    }

    public Book(String title, String category) {
        super(title, category);
    }

    public Book(String title) {
        super(title);
    }

    public void addAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.add(authorName);
            System.out.println("Author added successfully");
        } else {
            System.out.println("The author has already been added");
        }
    }

    public void removeAuthor(String authorName) {
        if (!(authors.contains(authorName))) {
            authors.remove(authorName);
            System.out.println("Author removed successfully");
        } else {

            System.out.println("The author has not been added");
        }
    }

}