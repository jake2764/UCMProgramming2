//Jake Beahan
//Jan 12 2024
//Assignment 0 Exercise 3 - Add Vector

import java.util.Scanner;

public class Exercise_0_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size;
        int[] v1, v2, v3;


        System.out.print("What size? ");
        size = scanner.nextInt();
        v1 = generateVector(size);
        v2 = generateVector(size);
        v3 = addVector(v1,v2);

        printVector(v1);
        System.out.println("\n+");
        printVector(v2);
        System.out.println("\n=");
        printVector(v3);

        scanner.close();
    }

    public static int[] generateVector(int size){
        int[] vector = new int[size];
        for(int i = 0; i < size; i++){
            vector[i] = (int)(Math.random()*10);
        }
        return vector;
    }
    public static int[] addVector(int[] v1, int[] v2){
        int[] vector = new int[v1.length];

        for(int i = 0; i < v1.length; i++){
            vector[i] = v1[i] + v2[i];
        }
        return vector;
    }

    public static void printVector(int[] vector){
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }
    }
}