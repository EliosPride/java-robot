package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class RobotTest {

    @Test
    public void testTurnLeftWhenRobotDirectionUp() {
        Robot robot = new Robot(Direction.UP, 0, 0);
        robot.turnLeft();
        Assert.assertEquals("Wrong turnLeft logic", Direction.LEFT, robot.getDirection());
    }

    @Test
    public void testTurnLeftWhenRobotDirectionDown() {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        robot.turnLeft();
        Assert.assertEquals("Wrong turnLeft logic", Direction.RIGHT, robot.getDirection());
    }

}
