package kata;

public class TicTacToe {

    public String play(Point point) {
        String[] rows = {"_|_|_", "_|_|_", "_|_|_"};

        for (int yAxis = 0; yAxis < 3; yAxis++) {
            if (point.y() == yAxis)
                rows[yAxis] = buildRow(point);
        }


        return String.join("\n", rows);
    }

    private String buildRow(Point point) {
        String[] cells = {"_", "_", "_"};
        for (int xAxis = 0; xAxis < 3; xAxis++) {
            if (point.x() == xAxis)
                cells[xAxis] = "X";
        }


        return String.join("|", cells);
    }
}
