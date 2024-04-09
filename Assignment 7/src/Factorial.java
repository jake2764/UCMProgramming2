//Factorial
//Jake Beahan
//April 8, 2024

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger input;

        System.out.print("Enter n: ");
        input = scanner.nextBigInteger();

        System.out.println(input.intValue() + "! = " + factorial(input));
    }

    public static BigInteger factorial(BigInteger n){
        if(n.intValue() <= 1) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }
}