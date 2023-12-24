package tic_tact_toe.views;

import javax.swing.*;

public class GameView extends View {
    private final JLabel titleFld = new JLabel("Tic Tac Toe"); {
        titleFld.setSize(300, 50);
    }

    public GameView(String title) {
        super(title);

        setSize(300, 300);
    }
}
