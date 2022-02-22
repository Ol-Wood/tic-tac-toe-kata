package kata;

public class TicTacToe {
    public String play(int x, int y) {

        if (x == 2){
            return "_|_|X\n" +
                    "_|_|_\n" +
                    "_|_|_";
        }

        if (x == 1){
            return "_|X|_\n" +
                    "_|_|_\n" +
                    "_|_|_";
        }
        return "X|_|_\n" +
                "_|_|_\n" +
                "_|_|_";
    }
}
