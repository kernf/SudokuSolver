import java.util.HashSet;

public class Row extends Sets{

    HashSet<Integer> r1 = new HashSet<>();
    HashSet<Integer> r2 = new HashSet<>();
    HashSet<Integer> r3 = new HashSet<>();
    HashSet<Integer> r4 = new HashSet<>();
    HashSet<Integer> r5 = new HashSet<>();
    HashSet<Integer> r6 = new HashSet<>();
    HashSet<Integer> r7 = new HashSet<>();
    HashSet<Integer> r8 = new HashSet<>();
    HashSet<Integer> r9 = new HashSet<>();

    public void updateSet(Cell cell) {
        int row = cell.getRow();
        int value = cell.getValue();
        HashSet<Integer> r = whatRow(row);
        assert r != null;
        r.add(value);
    }

    @Override
    public Boolean notFinished() {
        return r1.contains(0);
    }

    public HashSet<Integer> getSet(int row, int col) {
        return whatRow(row);
    }

    private HashSet<Integer> whatRow(int row) {
        if (row == 0) return r1;
        if (row == 1) return r2;
        if (row == 2) return r3;
        if (row == 3) return r4;
        if (row == 4) return r5;
        if (row == 5) return r6;
        if (row == 6) return r7;
        if (row == 7) return r8;
        if (row == 8) return r9;
        return null;
    }
}
