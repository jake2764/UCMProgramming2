//Jake Beahan
//Jan 12 2024
//Assignment 0 Exercise 5 - Add Matrix

import java.util.Scanner;

public class Exercise_0_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] m1,m2,m3;
        int size;


        System.out.print("What size? ");
        size = scanner.nextInt();

        m1 = generateMatrix(size);
        m2 = generateMatrix(size);
        m3 = addMatrix(m1,m2);

        printMatrix(m1);
        System.out.print("\n+ ");
        printMatrix(m2);
        System.out.print("\n= ");
        printMatrix(m3);

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
    public static int[][] addMatrix(int[][] m1, int[][] m2){
        int size = m1.length;
        int[][] matrix = new int[size][size];

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matrix[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){
        int size = matrix.length;

        for(int i = 0; i < size; i++) {
            System.out.println();
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}