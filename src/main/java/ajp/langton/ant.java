package ajp.langton;

public class ant {

    square[][] field = new square[11][11];
    orientation direction = orientation.SOUTH;
    int row = 0;
    int column = 0;

    public void move() {

    }

    public square getCurrentSquare() {
        return field[row-5][column-5];
    }


}
