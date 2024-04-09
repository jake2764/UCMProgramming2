//Jake Beahan
//Assignment 5.1 - BigPrimes
//Feb 26 2024

import java.math.BigInteger;
import java.util.Scanner;

public class BigPrimes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger min, max;


        System.out.print("Enter start of range: ");
        min = scanner.nextBigInteger();
        System.out.print("Enter end of range: ");
        max = scanner.nextBigInteger();

        System.out.println("Primes:");
        for(BigInteger bi = min; bi.compareTo(max) < 0; bi = bi.add(BigInteger.ONE)){
            if(bi.isProbablePrime(1)){
                System.out.println(bi);
            }
        }
        scanner.close();
    }
}