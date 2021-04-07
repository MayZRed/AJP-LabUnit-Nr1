package ajp.langton;

public enum color {
    WHITE, BLACK;

    public color switchColor() {
        if(this.ordinal()==0) {
            return BLACK;
        }else{
            return WHITE;
        }
    }
}
