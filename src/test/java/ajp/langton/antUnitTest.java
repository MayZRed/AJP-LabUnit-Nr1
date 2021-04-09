package ajp.langton;

import java.util.stream.Stream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class antUnitTest {

    @Test
    public void initialValueTest() {
        ant theAnt = new ant();

        Assert.assertEquals("initial row not 0 |", 0, theAnt.row);
        Assert.assertEquals("initial column not 0 |", 0, theAnt.column);
        Assert.assertEquals("initial square color not WHITE |", color.WHITE, theAnt.getCurrentSquare().getColor());
        Assert.assertEquals("initial orientation not SOUTH |", orientation.SOUTH, theAnt.direction);
    }

    private static Stream<Arguments> firstMoveParameters() {
        return Stream.of(
                Arguments.of(orientation.NORTH, color.WHITE, 0, 1),
                Arguments.of(orientation.EAST, color.WHITE, 1, 0),
                Arguments.of(orientation.SOUTH, color.WHITE, 0, -1),
                Arguments.of(orientation.WEST, color.WHITE, -1, 0),
                Arguments.of(orientation.NORTH, color.BLACK, 0, -1),
                Arguments.of(orientation.EAST, color.BLACK, -1, 0),
                Arguments.of(orientation.SOUTH, color.BLACK, 0, 1),
                Arguments.of(orientation.WEST, color.BLACK, 1, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("firstMoveParameters")
    public void initialUnitTest(orientation direction, color colour, int row, int column) {
        ant theAnt = new ant();

        theAnt.direction = direction;
        theAnt.getCurrentSquare().setColor(colour);
        square startSquare = theAnt.getCurrentSquare();

        theAnt.move();

        Assert.assertEquals("wrong row after start from (0/0) on a "+ colour.name() +" square facing "+ direction.name() +" |", row, theAnt.row);
        Assert.assertEquals("wrong column after start from (0/0) on a "+ colour.name() +" square facing "+ direction.name() +" |", column, theAnt.column);

        orientation newDirection;
        if(colour.ordinal()==0) {
            newDirection = direction.turnRight();
        }else{
            newDirection = direction.turnLeft();
        }

        Assert.assertEquals("wrong orientation after start from (0/0) on a "+ colour.name() +" square facing "+ direction.name() +" |", newDirection, theAnt.direction);
        Assert.assertEquals("wrong color of last square after start from (0/0) on a "+ colour.name() +" |", colour.switchColor(), startSquare.getColor());

    }
}
