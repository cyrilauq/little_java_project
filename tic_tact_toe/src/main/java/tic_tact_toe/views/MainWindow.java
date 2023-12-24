package tic_tact_toe.views;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Declare a class for the main window.
 * It will be in charge of holding views and display them.
 */
public class MainWindow extends JFrame {
    private final Set<View> views = new HashSet<>();

    /**
     * Create a main window with the given title and a list of views.
     *
     * @param title The title of the window
     * @param views The views to display
     */
    public MainWindow(final String title, final View... views) {
        super(title);
    }

    private void setViews(final View... views) {
        for (final View v : views) {
            if(this.views.contains(v)) {
                throw new IllegalArgumentException("View " + v.getTitle() + " already exists");
            }
            this.views.add(v);
        }
    }

}
