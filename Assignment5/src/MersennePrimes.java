//Jake Beahan
//Assignment 5.2 - MersennePrimes
//Feb 26 2024

import java.math.BigInteger;
import java.util.Scanner;

public class MersennePrimes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger p;


        System.out.print("Enter max p: ");
        p = scanner.nextBigInteger();


        System.out.println("p       Mersenne Prime");
        for(BigInteger bi = BigInteger.ZERO; bi.compareTo(p) < 0; bi = bi.add(BigInteger.ONE)){

            BigInteger potentialPrime = BigInteger.TWO.pow(bi.intValue()).subtract(BigInteger.ONE);

            if(potentialPrime.isProbablePrime(1)){
                System.out.println(bi + "      "   + potentialPrime);
            }
        }
        scanner.close();
    }
}