//Jake Beahan
//Assignment 2.2 - Album Class
//Feb 15 2024

public class Album {

    private String title, artist;
    private int year;
    private Song[] tracks;

    public Album(){
        this.title = "No title provided";
        this.artist = "No artist provided";
        this.year = -1;
        this.tracks = new Song[] {new Song("No songs provided", "No artist provided", "0:00")};
    }

    public Album(String title, String artist, int year, Song[] tracks){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public String toString(){
        String output = "\n" + title + "\n" + artist + "\n" + year + "\n\n";
        for(int i = 0; i < tracks.length; i++){
            output = output.concat(i+1 + ". " + tracks[i].getTitle() + " (" + tracks[i].getDuration() + ")" + "\n");
        }
        return output;
    }

    public static void main(String[] args) {
        Album album1 = new Album("Discovery", "Daft Punk", 2001, new Song[]{
                new Song("One More Time", "Daft Punk", "5:21"),
                new Song("Aerodynamic", "Daft Punk", "3:28"),
                new Song("Digital Love", "Daft Punk", "4:58"),
                new Song("Harder, Better, Faster, Stronger", "Daft Punk", "3:44"),
                new Song("Crescendolls", "Daft Punk", "3:32"),
                new Song("Nightvision", "Daft Punk", "1:44"),
                new Song("Superheroes", "Daft Punk", "3:57"),
                new Song("High Life", "Daft Punk", "3:22"),
                new Song("Something About Us", "Daft Punk", "3:51"),
                new Song("Voyager", "Daft Punk", "3:48"),
                new Song("Veridis Quo", "Daft Punk", "5:44"),
                new Song("Short Circuit", "Daft Punk", "3:26"),
                new Song("Face to Face", "Daft Punk", "4:00"),
                new Song("Too Long", "Daft Punk", "10:00")
        });

        System.out.println("album1: \n"+ album1);
    }
}