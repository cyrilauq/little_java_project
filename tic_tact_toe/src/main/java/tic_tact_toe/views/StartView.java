package tic_tact_toe.views;

import javax.swing.*;
import java.awt.*;

public class StartView extends View {
    private final JLabel titleFld = new JLabel("Tic Tac Toe"); {
        titleFld.setSize(300, 50);
    }
    private final JButton startBtn = new JButton("Start"); {
        startBtn.addActionListener(e -> goTo("GameView"));
    }
    private final JButton historyBtn = new JButton("History"); {
        historyBtn.addActionListener(e -> goTo("HistoryView"));
    }
    private final JPanel buttonsPanel = new JPanel(); {
        buttonsPanel.setLayout(new GridLayout(2, 1));
        buttonsPanel.add(startBtn);
        buttonsPanel.add(historyBtn);
    }

    public StartView(String title) {
        super(title);

        add(titleFld);
        add(buttonsPanel);
    }
}
