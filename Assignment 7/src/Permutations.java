//Permutations
//Jake Beahan
//April 8, 2024

import java.math.BigInteger;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BigInteger n;
        BigInteger k;

        System.out.print("Enter n: ");
        n = scanner.nextBigInteger();
        System.out.print("Enter k: ");
        k = scanner.nextBigInteger();

        System.out.println("P(" + n + ", " + k + ") = " + permutations(n,k) );
    }

    public static BigInteger factorial(BigInteger n){
        if(n.intValue() <= 1) return BigInteger.ONE;
        return n.multiply(factorial(n.subtract(BigInteger.ONE)));
    }

    public static BigInteger permutations(BigInteger n, BigInteger k){
        return factorial(n).divide(factorial(n.subtract(k)));
    }
}