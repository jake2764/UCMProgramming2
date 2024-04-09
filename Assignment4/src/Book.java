//Jake Beahan
//Assignment 4.1 - Meeting a Specification
//Feb 19 2024

public class Book {

    private String title, author;
    private long ISBN;

    public Book(){
        title = "The Art of War";
        author = "Sun Tzu";
        ISBN = 1111111111;
    }

    public Book(String title, String author, long isbn){
        this.title = title;
        this.author = author;
        this.ISBN = isbn;
    }

    public String toString(){
        return "\"" + title + "\" by " + author + " (" + ISBN + ")";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long isbn) {
        this.ISBN = isbn;
    }
}