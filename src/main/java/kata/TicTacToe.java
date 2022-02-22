package kata;

public class TicTacToe {
    private String currentPlayerToken = "X";
    private String emptyCellToken = "_";
    private String cellSeparator = "|";

    public String play(int x, int y) {
        var board = new String[3];

        for (int yAxis = 0; yAxis < 3; yAxis++) {
            if (yAxis == y){
                board[yAxis] = buildRow(x);
                continue;
            }
            board[yAxis] = "_|_|_";

        }

        return String.join("\n", board);
    }

    private String buildRow(int x) {
        var cells = new String[3];

        for (int xAxis = 0; xAxis < 3; xAxis++) {
            if (x == xAxis) {
                cells[xAxis] = currentPlayerToken;
                continue;
            }
            cells[xAxis] = emptyCellToken;
        }

        return String.join(cellSeparator, cells);
    }
}
