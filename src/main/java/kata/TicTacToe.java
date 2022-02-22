package kata;

public class TicTacToe {
    public String play(int x, int y) {
        var rows = new String[3];

        for (int yAxis = 0; yAxis < 3; yAxis++) {
            if (yAxis == y){
                rows[yAxis] = buildRow(x);
                continue;
            }
            rows[yAxis] = "_|_|_";

        }

        return String.join("\n", rows);
    }

    private String buildRow(int x) {
        var row = new String[3];

        for (int i = 0; i < 3; i++) {
            if (x == i) {
                row[i] = "X";
                continue;
            }
            row[i] = "_";
        }

        return String.join("|", row);
    }
}
