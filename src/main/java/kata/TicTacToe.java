package kata;

public class TicTacToe {
    public String play(int x, int y) {
        var gameSb = new StringBuilder();
        gameSb.append("_|_|_\n");
        gameSb.append("_|_|_\n");

        gameSb.append(buildRow(x));

        return gameSb.toString();
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
