/** Simulation of a Tic-Tac-Toe game (does not do strategy) */
public class TicTacToe {
    public static final int X = 1, O = -1;
    public static final int EMPTY = 0;
    private int board[][] = new int[3][3];
    private int player;

    // Constrcutor
    public TicTacToe() { clearBoard(); }

    // clears the board
    public void clearBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = EMPTY;
        player = X;
    }

    // X or O mark at position i,j 
    public void putMark(int i, int j) throws IllegalArgumentException {
        if (i < 0 || i > 2 || j < 0 || j > 2)
            throw new IllegalArgumentException("Invalid board position");
        if (board[i][j] != EMPTY)
            throw new IllegalArgumentException("Board position occupied.");
        board[i][j] = player; // place the mark for the current player
        player = -player; // switch players (O = -X)
    }

    // check if board is a win for given player
    public boolean isWin(int mark) {
        return ((board[0][0] + board[0][1] + board[0][2] == mark * 3) // row 0
                || (board[1][0] + board[1][1] + board[1][2] == mark * 3) // row 1
                || (board[2][0] + board[2][1] + board[2][2] == mark * 3) // row 2
                || (board[0][0] + board[1][0] + board[2][0] == mark * 3) // column 0
                || (board[0][1] + board[1][1] + board[2][1] == mark * 3) // column 1
                || (board[0][2] + board[1][2] + board[2][2] == mark * 3) // column 2
                || (board[0][0] + board[1][1] + board[2][2] == mark * 3) // diagonal
                || (board[2][0] + board[1][1] + board[0][2] == mark * 3)); // rev diag
    }

    // return winning player's code or if tie
    public int winner() {
        if (isWin(X))
            return(X);
        else if (isWin(O))
            return(O);
        else
            return(0);
    }

    // returns a char string showing current board
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (board[i][j]) {
                    case X:     sb.append("X"); break;
                    case O:     sb.append("O"); break;
                    case EMPTY: sb.append(" "); break;
                }
                if (j < 2) sb.append("|");
            }
            if (i < 2) sb.append("\n-----\n");
        }
        return sb.toString();
    }

    // Test run of a simple game (main)
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        // X moves             // O moves
        game.putMark(1,1);     game.putMark(0,2);
        game.putMark(2,2);     game.putMark(0,0);
        game.putMark(0,1);     game.putMark(2,1);
        game.putMark(1,2);     game.putMark(1,0);
        game.putMark(2,0);
        System.out.println(game);
        int winningPlayer = game.winner();
        String[] outcome = {"O wins", "Tie", "X wins"};
        System.out.println();
        System.out.println(outcome[1 + winningPlayer]);
    }
}
