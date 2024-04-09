//Jake Beahan
//Assignment 5.4 - Word+Character Count
//Feb 26 2024

import java.util.Scanner;

public class WCCount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        int wordLength, charLength;


        System.out.print("Enter text: ");
        input = scanner.nextLine();

        wordLength = input.split(" ").length;
        charLength = input.replaceAll(" ", "").split("").length;

        System.out.println("Word Count: " + wordLength);
        System.out.println("Character Count: " + charLength);
        scanner.close();
    }
}