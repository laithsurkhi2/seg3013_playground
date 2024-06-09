import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TicTacToeTest {
    //failing test
    @Test
    void initializesEmptyBoard() {
        TicTacToe game = new TicTacToe();
        String[][] expectedBoard = {
            {"", "", ""},
            {"", "", ""},
            {"", "", ""}
        };
        assertArrayEquals(expectedBoard, game.getBoard());
    }
}
