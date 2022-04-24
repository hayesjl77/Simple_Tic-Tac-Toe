package tictactoe;
import java.util.Scanner;
import java.util.*;



public class Main {

    static String[][] board = {{"|", " ", " ", " ", "|"},{"|", " ", " ", " ", "|"},{"|", " ", " ", " ", "|"}};
    public static void main(String[] args) {

        boolean winner =false;
        String turn ="X";

        //print empty board
        printBoard();

        do {
            //get input
            updateBoard(getCoords(), turn);
            //check winner
            String getWinner = checkWinner();
            switch(getWinner) {
                case "X wins":
                case "O wins":
                case "draw":
                    winner = true;
                    break;
            }
            //swap turns
            switch(turn) {
                case "X":
                    turn = "O";
                    break;
                default:
                    turn ="X";
                    break;
            }
            //Print the game board
            printBoard();

        } while (!(winner));
        System.out.print(checkWinner());


        //Check for winner
        //System.out.println(checkWinner());


    }
    //Collect Board
    static void getBoard() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter cells:");
        String myCells = scanner.nextLine();

        //row1 input into array
        board[0][1] = String.valueOf(myCells.charAt(0));
        board[0][2] = String.valueOf(myCells.charAt(1));
        board[0][3] = String.valueOf(myCells.charAt(2));
        //row1 input into array
        board[1][1] = String.valueOf(myCells.charAt(3));
        board[1][2] = String.valueOf(myCells.charAt(4));
        board[1][3] = String.valueOf(myCells.charAt(5));
        //row3 input into array
        board[2][1] = String.valueOf(myCells.charAt(6));
        board[2][2] = String.valueOf(myCells.charAt(7));
        board[2][3] = String.valueOf(myCells.charAt(8));

    }

    //Get coords from input
    static String getCoords() {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;

        int myCoordsx = 0;
        int myCoordsy = 0;
        do {
            System.out.print("Enter the coordinates:");

            try {
                myCoordsx = scanner.nextInt();
                if (myCoordsx >= 1 && myCoordsx <= 3) {
                    myCoordsy = scanner.nextInt();
                    if(myCoordsy >= 1 && myCoordsy <= 3 ) {
                        if (!Objects.equals(board[myCoordsx - 1][myCoordsy], "X")) {
                            if (!Objects.equals(board[myCoordsx - 1][myCoordsy], "O")) {
                                validInput = true;
                            }
                        } else {
                            System.out.println("This cell is occupied! Choose another one!");
                        }
                    } else {
                        System.out.println("Coordinates should be from 1 to 3!");
                    }
                } else {
                    System.out.println("Coordinates should be from 1 to 3!");
                    scanner.nextLine();
                }
            } catch (InputMismatchException exception) {
                System.out.println("You should enter numbers!");
                scanner.nextLine();
            }

        } while (!(validInput));
        return String.valueOf(myCoordsx) + String.valueOf(myCoordsy);
    }
    //Update board from input
    static void updateBoard(String coords,String turn) {
        String x = String.valueOf(coords.charAt(0));
        String y = String.valueOf(coords.charAt(1));

        board[Integer.parseInt(x) - 1][Integer.parseInt(y)] = turn;
    }

    //Print board
    static void printBoard() {
        System.out.println("---------");
        for (String[] row : board) {
            System.out.println(Arrays.toString(row).replace("_", " ").replace("[","").replace("]","").replace(",",""));
        }




        System.out.println("---------");
    }


    //check for winner
    static String checkWinner() {
        for (int a = 0; a < 8; a++) {
            String line = null;

            switch (a) {
                case 0:  //Horizontal cases
                    line = board[0][1] + board[0][2] + board[0][3];
                    break;
                case 1:
                    line = board[1][1] + board[1][2] + board[1][3];
                    break;
                case 2:
                    line = board[2][1] + board[2][2] + board[2][3];
                    break;
                case 3:  //Vertical cases
                    line = board[0][1] + board[1][1] + board[2][1];
                    break;
                case 4:
                    line = board[0][2] + board[1][2] + board[2][2];
                    break;
                case 5:
                    line = board[0][3] + board[1][3] + board[2][3];
                    break;
                case 6: //Diagonal cases
                    line = board[0][1] + board[1][2] + board[2][3];
                    break;
                case 7:
                    line = board[2][1] + board[1][2] + board[0][3];
                    break;
            }
            //Check X winner
            if (line.equalsIgnoreCase("XXX")) {
                return "X wins";
            }

            //Check O winner
            else if (line.equalsIgnoreCase("OOO")) {
                return "O wins";
            }
        }
        if (!Arrays.toString(board).contains(" ")) {
            return "draw";
        }
       return "No winner";
    }

}

