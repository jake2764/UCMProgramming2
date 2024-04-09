//Keep it Real
//Jake Beahan
//April 4, 2024

import java.util.Scanner;

public class KeepReal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double input;


        System.out.print("Enter a number: ");
        try {
            input = scanner.nextDouble();
            System.out.println("squareRoot(" + input + ") = " + squareRoot(input));
        } catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
    static double squareRoot(double x){
        if(x > 0){
            return Math.sqrt(x);
        } else {
            throw new IllegalArgumentException("Invalid input: x is negative: " + x);
        }
    }
}