package tic_tact_toe.domains;

public class Grid {
    private char[][] board = new char[3][3];

    /**
     * Play for the current player at the given position
     *
     * @param row       The row of the play
     * @param col       The column of the play
     * @param player    The player making the play
     *
     * @return          True if the game can continue, false otherwise
     */
    public boolean play(final int row, final int col, final char player) {
        board[row][col] = player;
        return !isFull() && !hasWon(player, row, col);
    }

    /**
     * Get the board
     *
     * @return  The board
     */
    public char[][] getBoard() {
        return board;
    }

    /**
     * Check if the board is full
     *
     * @return  True if the board is full, false otherwise
     */
    public boolean isFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (board[row][col] == Character.MIN_CODE_POINT)
                    return false;
        return true;
    }

    /**
     * Check if the player has won
     *
     * @param player    The player to check
     * @param row       The row of the last play
     * @param col       The column of the last play
     *
     * @return          True if the player has won, false otherwise
     */
    public boolean hasWon(char player, int row, int col) {
        return hasWonOnRow(player, row) || hasWonOnCol(player, col) || hasWonOnDiags(player, row, col);
    }

    /**
     * Check if the player has won in a given row
     *
     * @param player    The player to check
     * @param row       The row to check
     *
     * @return          True if the player has won on the row, false otherwise
     */
    private boolean hasWonOnRow(char player, int row) {
        return board[row][0] == player && board[row][1] == player && board[row][2] == player;
    }

    /**
     * Check if the player has won in a given column
     *
     * @param player    The player to check
     * @param col       The column to check
     *
     * @return          True if the player has won on the column, false otherwise
     */
    private boolean hasWonOnCol(char player, int col) {
        return board[0][col] == player && board[1][col] == player && board[2][col] == player;
    }

    /**
     * Check if the player has won on the diagonals
     *
     * @param player    The player to check
     * @param row       The row of the last play
     * @param col       The column of the last play
     *
     * @return          True if the player has won on the diagonals, false otherwise
     */
    private boolean hasWonOnDiags(char player, int row, int col) {
        return hasWonOnMainDiag(player, row, col) || hasWonOnSecondaryDiag(player, row, col);
    }

    /**
     * Check if the player has won on the main diagonal
     *
     * @param player    The player to check
     * @param row       The row of the last play
     * @param col       The column of the last play
     *
     * @return          True if the player has won on the main diagonal, false otherwise
     */
    private boolean hasWonOnMainDiag(char player, int row, int col) {
        return row == col && board[0][0] == player && board[1][1] == player && board[2][2] == player;
    }

    /**
     * Check if the player has won on the secondary diagonal
     *
     * @param player    The player to check
     * @param row       The row of the last play
     * @param col       The column of the last play
     *
     * @return          True if the player has won on the secondary diagonal, false otherwise
     */
    private boolean hasWonOnSecondaryDiag(char player, int row, int col) {
        return row + col == 2 && board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }
}
