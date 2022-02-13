import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CellTest {

    @Test
    void getValue() {
        Cell cell = new Cell(1,1,1);
        assertEquals(1, cell.getValue());
    }
}
