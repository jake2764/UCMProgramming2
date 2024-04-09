//Jake Beahan
//Assignment 5.6 - BigE
//Mar 13 2024

import java.math.BigDecimal;
import java.util.Scanner;

public class Bige {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int iterations, decimals;
        BigDecimal denominator, fraction, estimate = BigDecimal.ONE, numerator = BigDecimal.ONE;


        System.out.print("Enter number of iterations: ");
        iterations = scanner.nextInt();
        System.out.print("Enter number of decimal places: ");
        decimals = scanner.nextInt();

        for(int i = 1; i <= iterations; i++){
            denominator = factorial(BigDecimal.valueOf(iterations).subtract(BigDecimal.valueOf(i)));
            fraction = numerator.divide(denominator, decimals, BigDecimal.ROUND_UP);
            estimate = estimate.add(fraction);
        }

        System.out.println("Estimate: " + estimate);
        scanner.close();
    }
     public static BigDecimal factorial(BigDecimal i){
        if(i.compareTo(BigDecimal.ZERO) == 0) return BigDecimal.ONE;
        else return i.multiply(factorial(i.subtract(BigDecimal.ONE)));
    }
}