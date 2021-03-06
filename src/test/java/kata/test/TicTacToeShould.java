package kata.test;

import kata.Point;
import kata.TicTacToe;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {

    private static String emptyLine = "_|_|_";
    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp(){
        this.ticTacToe = new TicTacToe();
    }
    @ParameterizedTest
    @MethodSource("xFirstMoveTopLine")
    void place_x_first_move_on_top(Point input, String expected){
        String result = ticTacToe.play(input);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @MethodSource("xFirstMoveBottomLine")
    void place_x_first_move_on_bottom(Point input, String expected){
        String result = ticTacToe.play(input);

        assertEquals(expected, result);
    }


    private static Stream<Arguments> xFirstMoveTopLine(){
        return Stream.of(
                Arguments.of(new Point(0, 0), "X|_|_\n" + emptyLine + "\n" + emptyLine),
                Arguments.of(new Point(1, 0), "_|X|_\n" + emptyLine + "\n" + emptyLine),
                Arguments.of(new Point(2, 0), "_|_|X\n" + emptyLine + "\n" + emptyLine));
    }

    private static Stream<Arguments> xFirstMoveBottomLine(){
        return Stream.of(
                Arguments.of(new Point(0, 2), emptyLine + "\n" + emptyLine + "\n" + "X|_|_"),
                Arguments.of(new Point(1, 2), emptyLine + "\n" + emptyLine + "\n" + "_|X|_"),
                Arguments.of(new Point(2, 2), emptyLine + "\n" + emptyLine + "\n" + "_|_|X"));
    }


}
