//Jake Beahan
//Feb 12 2024
//Assignment 2.2 - Movie Class

public class Movie {

    String title;
    int length, releaseYear;
    public Movie(){
        title = "No name provided";
        length = -1;
        releaseYear = -1;
    }

    public Movie(String title, int length, int releaseYear){
        this.title = title;
        this.length = length;
        this.releaseYear = releaseYear;
    }

    public String toString(){
        return title + " (" + releaseYear + ") (" + length + ") Minutes";
    }

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        Movie movie2 = new Movie("Star Wars", 121, 1977);


        System.out.println("movie1: " + movie1);
        System.out.printf("movie2: " + movie2);
    }
}