package tic_tact_toe.viewmodels;

public class GameViewModel {
    private char currentPlayer = 'X';

    public void next() {
        currentPlayer = currentPlayer == 'X' ? 'O' : 'X';
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }
}
