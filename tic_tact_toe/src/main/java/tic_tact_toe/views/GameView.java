package tic_tact_toe.views;

import tic_tact_toe.viewmodels.GameViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameView extends View {
    private final GameViewModel viewModel = new GameViewModel();

    /**
     * TODO: Make something better and more maintainable/usable (it is a test here)
     */
    private final JLabel titleFld = new JLabel("Tic Tac Toe"); {
        titleFld.setSize(300, 50);
    }

    private final JPanel gamePnl = new JPanel(new GridLayout(3, 3)); {
        for (int i = 0; i < 9; i++) {
            final JButton btn = new JButton();
            btn.addActionListener(this::btnClicked);
            gamePnl.add(btn);
        }
    }

    public GameView(String title) {
        super(title);

        setSize(300, 300);

        add(titleFld);
        add(gamePnl);
    }

    private void btnClicked(ActionEvent actionEvent) {
        final JButton btn = (JButton) actionEvent.getSource();
        btn.setText(String.valueOf(viewModel.getCurrentPlayer()));
        btn.setEnabled(false);
        viewModel.next();
    }
}
