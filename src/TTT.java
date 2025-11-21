import java.util.Scanner;
public class TTT {

    //class variables - any method can access these
    static Scanner s = new Scanner(System.in);
    static String [][] board;

    public static void main(String [] args) {

        setup();
        String [] names = getNames();
        String [] pieces = {"x", "o"};
        printBoard();

        //1 or 0 - use as an index for names and pieces
        int currentPlayer = 0;
        boolean gameOver = false;
        while (!gameOver) {
            String pName = names[currentPlayer];
            String piece = pieces[currentPlayer];

            //two values: row, col
            int [] coords = turn(pName, piece);
            printBoard();
            gameOver = win(coords, piece) || tie();
            currentPlayer = change(currentPlayer);
        }
    }
}
