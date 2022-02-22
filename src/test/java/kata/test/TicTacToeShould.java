package kata.test;

import kata.TicTacToe;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

    private static String emptyLine = "_|_|_";
    @ParameterizedTest
    @MethodSource("xFirstMoveTopLine")
    void place_x_first_move_on_top_left(int x, int y, String expected){
        var ticTacToe = new TicTacToe();
        String result = ticTacToe.play(x,y);

        assertEquals(expected, result);
    }

    private static Stream<Arguments> xFirstMoveTopLine(){
        return Stream.of(
                Arguments.of(0, 0, "X|_|_\n" + emptyLine + "\n" + emptyLine),
                Arguments.of(1, 0, "_|X|_\n" + emptyLine + "\n" + emptyLine),
                Arguments.of(2, 0, "_|_|X\n" + emptyLine + "\n" + emptyLine));
    }


}
