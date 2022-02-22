package kata.test;

import kata.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

    @Test
    void place_x_first_move_on_top_left(){
        var ticTacToe = new TicTacToe();
        String expected = "X|_|_\n" +
                          "_|_|_\n" +
                          "_|_|x_";
        String result = ticTacToe.play(0,0);

        assertEquals(expected, result);
    }
}
