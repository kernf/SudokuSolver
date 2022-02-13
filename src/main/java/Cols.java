import java.util.HashSet;

public class Cols extends Sets {
    HashSet<Integer> c1 = new HashSet<>();
    HashSet<Integer> c2 = new HashSet<>();
    HashSet<Integer> c3 = new HashSet<>();
    HashSet<Integer> c4 = new HashSet<>();
    HashSet<Integer> c5 = new HashSet<>();
    HashSet<Integer> c6 = new HashSet<>();
    HashSet<Integer> c7 = new HashSet<>();
    HashSet<Integer> c8 = new HashSet<>();
    HashSet<Integer> c9 = new HashSet<>();

    public void updateSet(Cell cell) {
        int col = cell. getCol();
        int value = cell.getValue();
        HashSet<Integer> c = whatCol(col);
        assert c != null;
        c.add(value);
    }

    public HashSet<Integer> getSet(int row, int col) {
        return whatCol(col);
    }

    @Override
    public Boolean notFinished() {
        return c1.contains(0);
    }

    private HashSet<Integer> whatCol(int row) {
        if (row == 0) return c1;
        if (row == 1) return c2;
        if (row == 2) return c3;
        if (row == 3) return c4;
        if (row == 4) return c5;
        if (row == 5) return c6;
        if (row == 6) return c7;
        if (row == 7) return c8;
        if (row == 8) return c9;
        return null;
    }

}
