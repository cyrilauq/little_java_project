package tic_tact_toe.views;

import tic_tact_toe.viewmodels.GameViewModel;
import tic_tact_toe.viewmodels.args.PlayArgs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GameView extends View {
    private final GameViewModel viewModel = new GameViewModel();

    private final JLabel titleFld = new JLabel("Tic Tac Toe"); {
        titleFld.setSize(300, 50);
    }

    /**
     * TODO: Make something better and more maintainable/usable (it is a test here)
     */
    private final JPanel gamePnl = new JPanel(new GridLayout(3, 3)); {
        for (int i = 0; i < 9; i++) {
            final JButton btn = new JButton();
            int finalI = i;
            btn.setSize(50, 50);
            btn.addActionListener(e -> btnClicked(e, finalI));
            gamePnl.add(btn);
        }
    }

    public GameView(String title) {
        super(title);

        setSize(300, 300);

        add(titleFld);
        add(gamePnl);
    }

    private void btnClicked(ActionEvent actionEvent, int position) {
        final JButton btn = (JButton) actionEvent.getSource();
        btn.setText(String.valueOf(viewModel.getCurrentPlayer()));
        btn.setEnabled(false);
        final int[] coordinates = getCoordinates(position);
        viewModel.play(new PlayArgs(coordinates[0], coordinates[1]));
    }

    private int[] getCoordinates(int position) {
        return new int[] { position / 3, position % 3 };
    }
}
