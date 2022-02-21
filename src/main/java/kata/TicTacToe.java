package kata;

public class TicTacToe {
    public String play(int x, int y) {
        var rowThree = "_|_|_\n";
        var rowTwo = "_|_|_\n";
        var rowOne = "";
        if (x == 1){
            rowOne = "_|X|_";
        }

        if (x == 0){
            rowOne = "X|_|_";
        }
        return rowThree + rowTwo + rowOne;
    }
}
