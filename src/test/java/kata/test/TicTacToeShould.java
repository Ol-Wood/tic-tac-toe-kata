package kata.test;

import kata.TicTacToe;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

    private static String emptyRow = "_|_|_";

    @ParameterizedTest
    @MethodSource("xFirstMoveCases")
    void place_x_first_move_on_bottom_left(int x, int y, String expected){
        var ticTacToe = new TicTacToe();
        String result = ticTacToe.play(x,y);

        assertEquals(expected, result);
    }


    private static Stream<Arguments> xFirstMoveCases(){
        return Stream.of(
                Arguments.of(0, 0, emptyRow + "\n" + emptyRow + "\n" + "X|_|_"),
                Arguments.of(1, 0, emptyRow + "\n" + emptyRow + "\n" + "_|X|_"),
                Arguments.of(2, 0, emptyRow + "\n" + emptyRow + "\n" + "_|_|X"),
                Arguments.of(0, 1, emptyRow + "\n" + "X|_|_\n" + emptyRow)
                );
    }
}
