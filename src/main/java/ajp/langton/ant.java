package ajp.langton;

public class ant {

    square[][] field = new square[11][11];
    orientation direction = orientation.EAST;
    int row = 0;
    int column = 0;

    public ant() {
        int i1, i2;
        for(i1 = 0; i1<field.length; i1++) {
            for(i2 = 0; i2<field[i1].length; i2++) {
                field[i1][i2] = new square();
            }
        }
    }

    public void move() {
        if(getCurrentSquare().getColor()==color.WHITE) {
            this.direction = this.direction.turnRight();
        }else{
            this.direction = this.direction.turnLeft();
        }

        this.getCurrentSquare().changeColor();

        switch (direction) {
            case NORTH:
                row = row-1;
                break;
            case EAST:
                column = column+1;
                break;
            case SOUTH:
                row = row+1;
                break;
            case WEST:
                column = column-1;
                break;
        }
    }

    public square getCurrentSquare() {
        return field[row+5][column+5];
    }


}
