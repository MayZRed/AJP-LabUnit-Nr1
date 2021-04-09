package ajp.langton;

import org.junit.*;
import static ajp.langton.orientation.*;

public class orientationTest {

    private static final orientation[] orientations = new orientation[] {NORTH, EAST, SOUTH, WEST, NORTH};

    @Test
    public void orientationToRightTest() {
        int i;
        for(i = 0; i<(orientations.length-1); i++) {
            Assert.assertEquals("orientation failed to turn right", orientations[i+1], orientations[i].turnRight());
        }
    }

    @Test
    public void orientationToLeftTest() {
        int i;
        for(i = (orientations.length-1); i>0; i--) {
            Assert.assertEquals("orientation failed to turn left", orientations[i-1], orientations[i].turnLeft());
        }
    }
}
