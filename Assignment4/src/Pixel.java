//Jake Beahan
//Assignment 4.1 - Pixel Class
//Feb 19 2024

import java.util.Random;

public class Pixel {

    private int red, green, blue;

    public Pixel(){
        red = 0;
        green = 0;
        blue = 0;
    }

    public Pixel(int red, int green, int blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public String toString(){
        return "(" + red + ", " + green + ", " + blue + ")";
    }

    public static Pixel generateRandomPixel(){
        Random random = new Random();
        return new Pixel(random.nextInt(0,256), random.nextInt(0,256), random.nextInt(0,256));
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public static void main(String[] args) {

        Pixel pixel1 = new Pixel();
        Pixel pixel2 = new Pixel(0, 100, 100);
        Pixel pixel3 = generateRandomPixel();

        pixel2.setGreen(255);
        pixel2.setBlue(128);

        System.out.println("pixel1: " + pixel1);
        System.out.println("pixel2: " + pixel2);
        System.out.println("Random pixel: " + pixel3);
    }
}