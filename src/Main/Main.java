package Main;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        //current instance of our game board object
        char[][] board =newGameBoard();
        Scanner scan = new Scanner(System.in);
        //ask for and store users location for next placement
        System.out.println("Please enter your placement(1-9)");
        int pos = scan.nextInt();
        placePiece(board, pos, "player");
        printGameBoard(board);
    }
    //Method creates an empty game board for new games
    public static char[][] newGameBoard(){
        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};
        return gameBoard;
    }
    //Method handles printing the current game board
        public static void printGameBoard(char[][]gameBoard){
            for(char[] row:gameBoard){
                for(char c:row){
                    System.out.print(c);
                }
                System.out.println();
            }
        }
        public static void placePiece(char[][] board, int pos, String user){
        char symbol='!';
        if (user.equals("player1")){
            symbol ='X';
        }
        else if(user.equals("player2")){
            symbol ='O';
        }
            switch(pos){
                case 1:
                    board[0][0] = symbol;
                    break;
                case 2:
                    board[0][2] = symbol;
                    break;
                case 3:
                    board[0][4] = symbol;
                    break;
                case 4:
                    board[2][0] = symbol;
                    break;
                case 5:
                    board[2][2] = symbol;
                    break;
                case 6:
                    board[2][4] = symbol;
                    break;
                case 7:
                    board[4][0] = symbol;
                    break;
                case 8:
                    board[4][2] = symbol;
                    break;
                case 9:
                    board[4][4] = symbol;
                    break;
                default:
                    break;
            }
        }

}
