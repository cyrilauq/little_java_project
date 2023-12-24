package tic_tact_toe.views;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;
import java.util.function.Consumer;

public class View extends JPanel {

    private final String title;
    private Consumer<String> goToConsumer;

    public View(final String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void goTo(final String viewName) {
        goToConsumer.accept(viewName);
    }

    public void setConsumer(final Consumer<String> goToConsumer) {
        this.goToConsumer = goToConsumer;
    }

    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof View view)) return false;
        return Objects.equals(getTitle(), view.getTitle());
    }
}
