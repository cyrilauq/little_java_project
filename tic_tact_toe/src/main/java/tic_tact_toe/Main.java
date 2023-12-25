package tic_tact_toe;

import tic_tact_toe.infrastructures.Repositories;
import tic_tact_toe.repositories.LocalGameRepository;
import tic_tact_toe.views.GameView;
import tic_tact_toe.views.MainWindow;
import tic_tact_toe.views.StartView;

public class Main {
    public static void main(String[] args) {
        setRepositories();
        final MainWindow mainWindow = getMainWindow();

        mainWindow.start("StartView");
    }

    private static void setRepositories() {
        Repositories.setGameRepository(new LocalGameRepository());
    }

    private static MainWindow getMainWindow() {
        return new MainWindow(
            "Tic Tac Toe",
            new StartView("StartView"),
            new GameView("GameView")
        );
    }
}