import java.util.*;

public class Cell {
    int row;
    int col;
    int quadrant;

    int value;
    SortedSet<Integer> possible = new TreeSet<>();

    public Cell(int row, int col, int value) {
        this.row = row;
        this.col = col;
        this.quadrant = this.whatQuadrant();
        this.value = value;
        if (value == 0) {
            this.possible.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        }
    }

    private int whatQuadrant() {
        // Quadrants numbering
        // 1 2 3
        // 4 5 6
        // 7 8 9
        if (row >= 0 && row <= 2) {
            if (col >= 0 && col <= 2) return 1;
            if (col >= 3 && col <= 5) return 2;
            if (col >= 6 && col <= 8) return 3;
        }
        if (row >= 3 && row <= 5) {
            if (col >= 0 && col <= 2) return 4;
            if (col >= 3 && col <= 5) return 5;
            if (col >= 6 && col <= 8) return 6;
        }
        if (row >= 6 && row <= 8) {
            if (col >= 0 && col <= 2) return 7;
            if (col >= 3 && col <= 5) return 8;
            if (col >= 6 && col <= 8) return 9;
        }

        return 0;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public int getValue() {
        return(value);
    }
    public SortedSet<Integer> getPossible() {
        return(possible);
    }
    public int getRow() {
        return this.row;
    }
    public int getCol() {
        return this.col;
    }
}
