package ajp.langton;

public enum orientation {
    NORTH, EAST, SOUTH, WEST;

    private static final orientation[] orientations = orientation.values();

    public orientation turnRight() {
        return orientations[(this.ordinal()+1)%orientations.length];
    }

    public orientation turnLeft() {
        return orientations[(orientations.length+this.ordinal()-1)%orientations.length];
    }
}
