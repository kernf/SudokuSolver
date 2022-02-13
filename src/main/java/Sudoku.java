public class Sudoku {
    int[][] input;
    Cell[][] inputCells = new Cell[9][9];

    Sets qs = new Quadrants();
    Sets rs = new Row();
    Sets cs = new Cols();

    public Sudoku(int[][] input) {
        this.input = input;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Cell cell = new Cell(i, j, input[i][j]);
                updateSets(cell);
                inputCells[i][j] = cell;
            }
        }
    }

    private void updateSets(Cell cell) {
        qs.updateSet(cell);
        rs.updateSet(cell);
        cs.updateSet(cell);
    }

    public void solve() {
        //while(qs.notFinished()) {
        for (int k = 0; k < 30; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (inputCells[i][j].value == 0) {
                        intersect(inputCells[i][j], qs);
                        intersect(inputCells[i][j], rs);
                        intersect(inputCells[i][j], cs);
                    }
                }
            }
        }
    }

    public int[][] toArray() {
        int[][] ret = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                ret[i][j] = inputCells[i][j].value;
            }
        }
        return ret;
    }

    private void update(Cell cell) {
        if (cell.getPossible().size() == 1) {
            cell.setValue(cell.getPossible().first());
        }
    }

    private void intersect(Cell cell, Sets cs) {
        cell.getPossible().removeAll(cs.getSet(cell.row, cell.col));
        update(cell);
    }

    public void print() {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i > 0) {
                System.out.println("---   ---   ---");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j > 0) {
                    System.out.print(" | ");
                }
                System.out.print(inputCells[i][j].getValue());
            }
            System.out.println();
        }
    }
}
