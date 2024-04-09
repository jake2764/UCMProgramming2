//Jake Beahan
//Assignment 5.5 - BigPi
//Mar 13 2024

import java.math.BigDecimal;
import java.util.Scanner;

public class BigPi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations, decimals;
        BigDecimal fraction, denominator, numerator = BigDecimal.ONE, estimate = BigDecimal.ZERO;

        System.out.print("Enter number of iterations: ");
        iterations = scanner.nextInt();
        System.out.print("Enter number of decimal places: ");
        decimals = scanner.nextInt();

        //4*(1 - 1/div + 1/div*2+1 - 1/div*2+1)
        for(int i = 0; i < iterations; i++){

            denominator = BigDecimal.valueOf((2 * i) + 1);
            fraction = numerator.divide(denominator, decimals, BigDecimal.ROUND_UP);

            if(i % 2 == 0) estimate = estimate.add(fraction);
            else estimate = estimate.subtract(fraction);
        }

        estimate = estimate.multiply(BigDecimal.valueOf(4));

        System.out.println("Estimate: " + estimate);

        scanner.close();
    }
}