package ajp.langton;

public class square {

    private color colour = color.WHITE;

    public color getColor() {
        return colour;
    }

    public void changeColor() {
        this.colour = colour.switchColor();
    }
}
