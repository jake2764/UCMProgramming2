//Jake Beahan
//Assignment 5.3 - CleanStrings
//Feb 26 2024

import java.util.Scanner;

public class CleanStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input;
        String[] offensiveWords = {"help", "dime", "ask", "beach","ship","fish"};


        System.out.print("Enter text: ");
        input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        for(int i = 0; i < inputArray.length; i++){
            for(int j = 0; j < offensiveWords.length; j++){
                if(inputArray[i].toLowerCase().contains(offensiveWords[j])){
                    input = input.replaceAll(inputArray[i], "*".repeat(inputArray[i].length()));
                }
            }
        }
        System.out.println(input);
        scanner.close();
    }
}