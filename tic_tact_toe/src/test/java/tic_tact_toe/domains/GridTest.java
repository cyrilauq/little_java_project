package tic_tact_toe.domains;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GridTest {
    private Grid grid;

    @BeforeEach
    void setUp() {
        grid = new Grid();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void whenPlayXAtRow0Col0ThenGridHasXAtRow0Col0() {
        assertTrue(grid.play(0, 0, 'X'));
        assertEquals('X', grid.getBoard()[0][0]);
    }

    @Test
    void whenNoPlayMakeThenGridIsEmpty() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                assertEquals(Character.MIN_CODE_POINT, grid.getBoard()[row][col]);
    }

    @Test
    void when3SignsInARowThenPlayerWins() {
        grid.play(0, 0, 'X');
        grid.play(0, 1, 'X');
        assertFalse(grid.play(0, 2, 'X'));
    }

    @Test
    void when3SignsInAColThenPlayerWins() {
        grid.play(0, 0, 'X');
        grid.play(1, 0, 'X');
        assertFalse(grid.play(2, 0, 'X'));
    }

    @Test
    void when3SignsInAMainDiagThenPlayerWins() {
        grid.play(0, 0, 'X');
        grid.play(1, 1, 'X');
        assertFalse(grid.play(2, 2, 'X'));
    }

    @Test
    void when3SignsInASecondaryDiagThenPlayerWins() {
        grid.play(0, 2, 'X');
        grid.play(1, 1, 'X');
        assertFalse(grid.play(2, 0, 'X'));
    }
}