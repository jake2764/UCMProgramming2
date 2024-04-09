//Array Bounds
//Jake Beahan
//April 4, 2024

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayBounds {
    public static void main(String[] args) {

        int[] array = new int[10];
        int input;
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        try {
            System.out.print("Enter an index: ");
            input = scanner.nextInt();
            System.out.println("Value at index is " + array[input]);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
        scanner.close();
    }
}