// Scoreboard class for GameEntry
public class Scoreboard {
    private int numEntries = 0;
    private GameEntry[] board; // array of game entries (names, scores)

    public ScoreBoard(int capacity) {
        board = new GameEntry[capacity];
    }

    // add new score to scores array
    public void add(GameEntry e) {
        int newScore = e.getScore();

        // check if e is high score
        if (numEntries < board.length ||
            newScore > board[numEntries - 1].getScore()) {
            if (numEntries < board.length) {
                numEntries++;
            }
            // shift right lower scores for new entry
            int j = numEntries - 1;
            while (j > 0 && board[j - 1].getScore() < newScore) {
                board[j] = board[j - 1]; // shift entry from j - 1 to j
                j--;
            }
            board[j] = e;
        }
    }

    public GameEntry remove(int i) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries) {
            throws new IndexOutOfBoundsException("Invalid index: " + i);
        }
        GameEntry temp = board[i];
        for (int j = i; j < numEntries - 1; j++) {
            board[j] = board[j + 1]; // move one cell to the left
        }
        board[numEntries - 1] = null;
        numEntries--;
        return temp;
    }
}
