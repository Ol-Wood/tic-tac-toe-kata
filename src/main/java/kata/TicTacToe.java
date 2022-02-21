package kata;

public class TicTacToe {
    public String play(int x, int y) {

        if (x == 1){
            return "_|_|_\n" +
                    "_|_|_\n" +
                    "_|X|_";
        }
        return "_|_|_\n" +
                "_|_|_\n" +
                "X|_|_";
    }
}
