package tic_tact_toe.infrastructures;

public class Repositories {

    private static IGameRepository repository = null;

    public static IGameRepository getGameRepository() {
        return repository;
    }

    public static void setGameRepository(IGameRepository gameRepository) {
        repository = gameRepository;
    }

}
