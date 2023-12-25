package tic_tact_toe.domains;

import tic_tact_toe.viewmodels.args.PlayArgs;

/**
 * Represents a game
 */
public class Game {
    private char currentPlayer = 'X';
    private char winner = ' ';
    private final Grid grid = new Grid();

    /**
     * Play for the current player at the given position
     *
     * @param args  The arguments for the play
     *
     * @return      True if the game can continue, false otherwise
     */
    public boolean play(final PlayArgs args) {
        if (grid.play(args.row(), args.col(), currentPlayer)) {
            currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
            return true;
        }
        winner = currentPlayer;
        return false;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public char getWinner() {
        return winner;
    }
}
