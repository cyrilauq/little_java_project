package tic_tact_toe.viewmodels.args;

/**
 * Represents the arguments for the play method
 *
 * @param row   The row were the player played
 * @param col   The column were the player played
 */
public record PlayArgs(
        int row,
        int col
) {
}
