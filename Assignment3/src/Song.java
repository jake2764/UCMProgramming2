//Jake Beahan
//Assignment 2.1 - Song Class
//Feb 15 2024


public class Song {

    private String title, artist, duration;


    public Song(){
        this.title = "No title provided";
        this.artist = "No artist provided";
        duration = "0:00";
    }

    public Song(String title, String artist, String duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
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

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String toString(){
        return "\""+title + "\"" + " by " + artist + " (" + duration + ")";
    }



    public static void main(String[] args) {

        Song song1 = new Song();
        Song song2 = new Song("Sukiyaki", "Kyu Sakamoto", "3:09");

        song1.setTitle("Fireflies");
        song1.setArtist("Owl City");
        song1.setDuration("3:54");

        System.out.println("song1: " + song1);
        System.out.println("song2: " + song2);
    }
}