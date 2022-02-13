import java.util.HashSet;

public class Quadrants extends Sets {
    HashSet<Integer> q1 = new HashSet<>();
    HashSet<Integer> q2 = new HashSet<>();
    HashSet<Integer> q3 = new HashSet<>();
    HashSet<Integer> q4 = new HashSet<>();
    HashSet<Integer> q5 = new HashSet<>();
    HashSet<Integer> q6 = new HashSet<>();
    HashSet<Integer> q7 = new HashSet<>();
    HashSet<Integer> q8 = new HashSet<>();
    HashSet<Integer> q9 = new HashSet<>();

    public void updateSet(Cell cell) {
        int row = cell.getRow();
        int col = cell.getCol();
        int value = cell.getValue();
        HashSet<Integer> s = whatQuadrant(row, col);
        s.add(value);
    }

    public HashSet<Integer> getSet(int row, int col) {
        return whatQuadrant(row, col);
    }

    @Override
    public Boolean notFinished() {
        return q1.contains(0);
    }

    private HashSet<Integer> whatQuadrant(int row, int col) {
        // Quadrants numbering
        // 1 2 3
        // 4 5 6
        // 7 8 9
        if (row >= 0 && row <= 2) {
            if (col >= 0 && col <= 2) return q1;
            if (col >= 3 && col <= 5) return q2;
            if (col >= 6 && col <= 8) return q3;
        }
        if (row >= 3 && row <= 5) {
            if (col >= 0 && col <= 2) return q4;
            if (col >= 3 && col <= 5) return q5;
            if (col >= 6 && col <= 8) return q6;
        }
        if (row >= 6 && row <= 8) {
            if (col >= 0 && col <= 2) return q7;
            if (col >= 3 && col <= 5) return q8;
            if (col >= 6 && col <= 8) return q9;
        }

        return null;
    }

}
