package kata.test;

import kata.TicTacToe;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

    @Test
    void place_x_first_move_on_bottom_left(){
        var ticTacToe = new TicTacToe();
        String expected = "_|_|_\n" +
                          "_|_|_\n" +
                          "X|_|_";
        String result = ticTacToe.play(0,0);

        assertEquals(expected, result);
    }

    @Test
    void place_x_first_move_on_bottom_middle(){
        var ticTacToe = new TicTacToe();
        String expected = "_|_|_\n" +
                "_|_|_\n" +
                "_|X|_";
        String result = ticTacToe.play(1,0);

        assertEquals(expected, result);
    }

    @Test
    void place_x_first_move_on_bottom_right(){
        var ticTacToe = new TicTacToe();
        String expected = "_|_|_\n" +
                "_|_|_\n" +
                "_|_|X";
        String result = ticTacToe.play(2,0);

        assertEquals(expected, result);
    }
}
