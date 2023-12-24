package tic_tact_toe;

import tic_tact_toe.views.MainWindow;
import tic_tact_toe.views.StartView;

public class Main {
    public static void main(String[] args) {
        final MainWindow mainWindow = getMainWindow();

        mainWindow.start("StartView");
    }

    private static MainWindow getMainWindow() {
        return new MainWindow(
            "Tic Tac Toe",
            new StartView("StartView")
        );
    }
}