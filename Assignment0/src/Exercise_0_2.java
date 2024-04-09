//Jake Beahan
//Jan 12 2024
//Assignment 0 Exercise 2 - Print Vector

import java.util.Scanner;

public class Exercise_0_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] vector;


        System.out.print("What size? ");
        size = scanner.nextInt();
        vector = generateVector(size);

        System.out.println("\nRandom Vector:");
        printVector(vector);
        scanner.close();
    }

    public static int[] generateVector(int size){
        int[] vector = new int[size];
        for(int i = 0; i < size; i++){
            vector[i] = (int)(Math.random()*10);
        }
        return vector;
    }
    public static void printVector(int[] vector){
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}