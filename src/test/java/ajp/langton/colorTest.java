package ajp.langton;

import org.junit.*;

public class colorTest {

    @Test
    public void colorSwitchTest() {
        color afterWhite = color.WHITE.switchColor();
        Assert.assertEquals("color white don't changes |", color.BLACK, afterWhite);
        color afterBlack = color.BLACK.switchColor();
        Assert.assertEquals("color black don't changes |", color.WHITE, afterBlack);
    }
}
