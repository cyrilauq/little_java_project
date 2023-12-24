package tic_tact_toe.viewmodels;

import tic_tact_toe.viewmodels.args.PlayArgs;

public class GameViewModel {
    private char currentPlayer = 'X';

    /**
     * Play for the current player at the given position
     *
     * @param args  The arguments for the play
     *
     * @return      True if the game can continue, false otherwise
     */
    public Boolean play(final PlayArgs args) {
        currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
        return true;
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
