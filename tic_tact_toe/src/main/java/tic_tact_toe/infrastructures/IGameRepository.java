package tic_tact_toe.infrastructures;

import tic_tact_toe.domains.Game;

/**
 * Declare the methods that the game repository must implement
 */
public interface IGameRepository {

    /**
     * Save the game
     *
     * @param game  The game to save
     */
    void save(Game game);

    /**
     * Get the game
     *
     * @return The game
     */
    Game getGame();

}
