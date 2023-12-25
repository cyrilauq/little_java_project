package tic_tact_toe.repositories;

import tic_tact_toe.domains.Game;
import tic_tact_toe.infrastructures.IGameRepository;

public class LocalGameRepository implements IGameRepository {
    private Game game;

    public LocalGameRepository() {
        this.game = new Game();
    }

    @Override
    public void save(final Game game) {
        this.game = game;
    }

    @Override
    public Game getGame() {
        return game;
    }

}
