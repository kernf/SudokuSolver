import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {

    @Test
    void solve() {
        int[][] input = new int[][]{
                {0, 7, 5, 0, 9, 0, 0, 0, 6},
                {0, 2, 3, 0, 8, 0, 0, 4, 0},
                {8, 0, 0, 0, 0, 3, 0, 0, 1},
                {5, 0, 0, 7, 0, 2, 0, 0, 0},
                {0, 4, 0, 8, 0, 6, 0, 2, 0},
                {0, 0, 0, 9, 0, 1, 0, 0, 3},
                {9, 0, 0, 4, 0, 0, 0, 0, 7},
                {0, 6, 0, 0, 7, 0, 5, 8, 0},
                {7, 0, 0, 0, 1, 0, 3, 9, 0}
        };

        int[][] solution = new int[][]{
                {1, 7, 5, 2, 9, 4, 8, 3, 6},
                {6, 2, 3, 1, 8, 7, 9, 4, 5},
                {8, 9, 4, 5, 6, 3, 2, 7, 1},
                {5, 1, 9, 7, 3, 2, 4, 6, 8},
                {3, 4, 7, 8, 5, 6, 1, 2, 9},
                {2, 8, 6, 9, 4, 1, 7, 5, 3},
                {9, 3, 8, 4, 2, 5, 6, 1, 7},
                {4, 6, 1, 3, 7, 9, 5, 8, 2},
                {7, 5, 2, 6, 1, 8, 3, 9, 4}
        };

        Sudoku sudoku = new Sudoku(input);
        sudoku.solve();
        int[][] solved = sudoku.toArray();

        Boolean bool = Arrays.deepEquals(solved, solution);
        assertEquals(true, bool);

    }
}
