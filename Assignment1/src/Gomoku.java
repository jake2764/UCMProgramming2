//Jake Beahan
//Jan 24 2024
//Assignment 1 - Gomoku

import java.util.Scanner;

public class Gomoku {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[19][19];
        boolean player1 = true, player1Win = false, boardFull = false;


        //Game loop, will break when an end condition is met
        while(true){

            int row;
            int column;

            displayBoard(board);

            //End Conditions
            if(hasPlayerWon(board, 1)){
                player1Win = true;
                break;
            } else if(hasPlayerWon(board, 2)){
                break;
            } else if(isBoardFull(board)) {
                boardFull = true;
                break;
            }

            //Display which players turn it is
            if(player1){
                System.out.println("\nPlayer 1's turn!");
            } else {
                System.out.println("\nPlayer 2's turn!");
            }

            System.out.print("Enter row: ");
            row = scanner.nextInt();
            System.out.print("Enter column: ");
            column = scanner.nextInt();

            //Checking if move is valid and if it is place a stone
            if(isValidMove(board, row, column)){
                if(player1) {
                    board[row][column] = '\u25cf';
                } else {
                    board[row][column] = '\u25cb';
                }
                player1 = !player1;
            } else {
                System.out.println("\nInvalid move! Try again!");
            }
        }

        //Logic after an end condition is met - Player 1 wins, player 2 wins, or board is full
        if(player1Win) {
            System.out.println("\nPlayer 1 Wins!");
        } else if(!boardFull) {
            System.out.println("\nPlayer 2 Wins!");
        } else {
            System.out.println("\nBoard is full and no one won the game.");
        }

        scanner.close();
    }

    public static void displayBoard(char[][] board){
        for(int i = 0; i < board.length; i++){
            System.out.println();
            for(int j = 0; j < board.length; j++){
                //Checks for empty space on board and fills with '.' if it is and players input if not
                if(board[i][j] == '\u0000'){
                    System.out.print(". ");
                } else{
                    System.out.print(board[i][j] + " ");
                }
            }
        }
    }

    public static boolean isValidMove(char[][] board, int row, int column){
        if(row > 18 || column > 18 || row < 0 || column < 0) return false;
        //Checking if row and column is empty
        return board[row][column] == '\u0000';
    }

    public static boolean isBoardFull(char[][] board){
        //Checks if any space is still empty and breaks instantly if an empty spot is found
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '\u0000') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean hasPlayerWon(char[][] board, int player){
        return isHorizontalWin(board, player) || isVerticalWin(board, player) || isDiagonalWin(board, player);
    }

    public static boolean isHorizontalWin(char[][] board, int player){

        char check;
        boolean win = false;
        if(player == 1) check ='\u25cf';
        else check = '\u25cb';

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == check) {
                    for(int k = 0; k < 5; k++){
                        if(j + k > 18) return false;
                        if(board[i][j + k] != check) {
                            win = false;
                            break;
                        }
                        win = true;
                    }
                    if(win) return true;
                }
            }
        }
        return false;
    }

    public static boolean isVerticalWin(char[][] board, int player){

        char check;
        boolean win = false;
        if(player == 1) check ='\u25cf';
        else check = '\u25cb';

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == check) {
                    for(int k = 0; k < 5; k++){
                        if(i + k > 18) return false;
                        if(board[i+k][j] != check) {
                            win = false;
                            break;
                        }
                        win = true;
                    }
                    if(win)return true;
                }
            }
        }
        return false;
    }

    public static boolean isDiagonalWin(char[][] board, int player){

        char check;
        boolean win = true;
        if(player == 1) check ='\u25cf';
        else check = '\u25cb';

        //This is messy because multiple checks are needed in this method :zany:
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == check) {
                        //Diagonal Down Right
                        for(int k = 0; k < 5; k++) {
                            if(i + k > 18 || j + k > 18) {
                                win = false;
                                break;
                            }
                            if (board[i + k][j + k] != check) {
                                win = false;
                            }

                        }
                        if(win) return true;
                        win = true;
                        //Diagonal Down Left
                    for(int k = 0; k < 5; k++) {
                        if(i - k < 0 || j + k > 18) {
                            win = false;
                            break;
                        }
                        if (board[i - k][j + k] != check) {
                            win = false;
                        }
                    }
                    if(win) return true;
                }
            }
        }
        return false;
    }
}