package tic_tact_toe.views;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

/**
 * Declare a class for the main window.
 * It will be in charge of holding views and display them.
 */
public class MainWindow extends JFrame {
    private final Map<String, View> views = new HashMap<>();

    /**
     * Create a main window with the given title and a list of views.
     *
     * @param title The title of the window
     * @param views The views to display
     */
    public MainWindow(final String title, final View... views) {
        super(title);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setViews(views);
    }

    public void start(final String viewName) {
        goTo(viewName);
        setVisible(true);
    }

    private void setViews(final View... views) {
        for (final View v : views) {
            if(this.views.containsKey(v.getTitle())) {
                throw new IllegalArgumentException("View " + v.getTitle() + " already exists");
            }
            v.setConsumer(this::goTo);
            this.views.put(v.getTitle(), v);
        }
    }

    private void goTo(final String viewName) {
        final View view = views.get(viewName);
        if (view == null) {
            throw new IllegalArgumentException("View " + viewName + " does not exist");
        }
        setContentPane(view);
    }

}
