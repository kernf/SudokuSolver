import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

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

        Sudoku sudoku = new Sudoku(input);
        sudoku.solve();
        sudoku.print();

    }
}
