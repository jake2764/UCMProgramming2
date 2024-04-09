//Jake Beahan
//Jan 12 2024
//Assignment 0 Exercise 1 - Poisson Distribution

import java.util.Scanner;

public class Exercise_0_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lambda = 1;
        int k;

        System.out.print("Enter k: ");
        k = scanner.nextInt();

        System.out.print("\nProbability: " + poisson(k, lambda));

        scanner.close();
    }

    public static double poisson(int k, double lambda){
        return Math.pow(Math.E, -(lambda)) * (Math.pow(lambda, k) / factorial(k));
    }

    public static int factorial(int n){
            if(n == 0 || n == 1){
                return 1;
            } else {
                return n*factorial(n-1);
            }
    }
}