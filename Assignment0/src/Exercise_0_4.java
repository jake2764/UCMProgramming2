//Jake Beahan
//Jan 12 2024
//Assignment 0 Exercise 4 - Print Matrix

import java.util.Scanner;

public class Exercise_0_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int size;


        System.out.print("What size? ");
        size = scanner.nextInt();
        matrix = generateMatrix(size);

        System.out.print("\nRandom Matrix:");
        printMatrix(matrix);
        scanner.close();
    }

    public static int[][] generateMatrix(int size){
        int[][] matrix = new int[size][size];
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = (int)(Math.random()*10);
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int size = matrix.length;

        for(int i = 0; i < size; i++){
            System.out.println();
            for(int j = 0; j < size; j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}