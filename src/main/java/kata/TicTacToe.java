package kata;

public class TicTacToe {

    public String play(Point point) {

        var rowOne = buildRow(point);

        return rowOne + "\n" +
                "_|_|_\n" +
                "_|_|_";
    }

    private String buildRow(Point point) {
        if (point.x() == 0){
            return "X|_|_";
        }
        if (point.x() == 1){
            return "_|X|_";
        }

        return "_|_|X";
    }
}
