package tic_tact_toe.viewmodels;

import tic_tact_toe.domains.Game;
import tic_tact_toe.infrastructures.IGameRepository;
import tic_tact_toe.infrastructures.Repositories;
import tic_tact_toe.viewmodels.args.PlayArgs;

public class GameViewModel {
    private final IGameRepository gameRepository = Repositories.getGameRepository();
    private final Game game = gameRepository.getGame();

    /**
     * Play for the current player at the given position
     *
     * @param args  The arguments for the play
     *
     * @return      True if the game can continue, false otherwise
     */
    public boolean play(final PlayArgs args) {
        return game.play(args);
    }

    public char getCurrentPlayer() {
        return game.getCurrentPlayer();
    }
    
    public char getWinner() {
        return game.getWinner();
    }
}
