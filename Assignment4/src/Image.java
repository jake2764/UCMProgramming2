//Jake Beahan
//Assignment 4.3 - Image Class
//Feb 19 2024

import java.util.Random;

public class Image {
    private int width, height;
    private Pixel[][] data;

    public Image(){
        this.width = 1;
        this.height = 1;
        this.data = new Pixel[width][height];
    }

    public Image(int width, int height, Pixel[][] data){
        this.width = width;
        this.height = height;
        this.data = data;
    }

    public void setPixel(Pixel pixel, int row, int column){
            data[row][column] = pixel;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if(width > 0){
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        }
    }

    public Pixel[][] getData() {
        return data;
    }

    public void setData(Pixel[][] data) {
        this.data = data;
    }

    public String toString(){
        String string = "Dimensions: " + width + " by " + height + "\nData:";
        for(int i = 0; i < height; i++){
            string = string.concat("\n");
            for(int j = 0; j < width; j++){
                string = string.concat(data[i][j].toString() + " ");
            }
        }
        return string;
    }



    public static void main(String[] args) {
        Random random = new Random();
        int width = 5;
        int height = 5;
        Image image1 = new Image(width,height,new Pixel[width][height]);


        //Generates 5 random Pixels and places them in the image, checking that
        //each location is not filled by an already generated random Pixel
        for(int i = 0; i < 5; i++){
            int randomRow = random.nextInt(width);
            int randomColumn = random.nextInt(height);
            if(image1.getData()[randomRow][randomColumn] == null){
                image1.setPixel(Pixel.generateRandomPixel(), randomRow, randomColumn);
            } else{
                i--;
            }
        }

        //Fills Image with default pixels in all spots not taken by randomly generated Pixels
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(image1.getData()[i][j] == null){
                    image1.setPixel(new Pixel(), i, j);
                }
            }
        }

        System.out.println("image1:\n" + image1);
    }
}