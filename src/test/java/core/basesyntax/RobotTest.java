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

    @Test
    public void testTurnLeftWhenRobotDirectionLeft() {
        Robot robot = new Robot(Direction.LEFT, 0, 0);
        robot.turnLeft();
        Assert.assertEquals("Wrong turnLeft logic", Direction.DOWN, robot.getDirection());
    }

    @Test
    public void testTurnLeftWhenRobotDirectionRight() {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        robot.turnLeft();
        Assert.assertEquals("Wrong turnLeft logic", Direction.UP, robot.getDirection());
    }

    @Test
    public void testTurnRightWhenRobotDirectionUp() {
        Robot robot = new Robot(Direction.UP, 0, 0);
        robot.turnRight();
        Assert.assertEquals("Wrong turnRight logic", Direction.RIGHT, robot.getDirection());
    }

    @Test
    public void testTurnRightWhenRobotDirectionDown() {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        robot.turnRight();
        Assert.assertEquals("Wrong turnRight logic", Direction.LEFT, robot.getDirection());
    }

    @Test
    public void testTurnRightWhenRobotDirectionLeft() {
        Robot robot = new Robot(Direction.LEFT, 0, 0);
        robot.turnRight();
        Assert.assertEquals("Wrong turnRight logic", Direction.UP, robot.getDirection());
    }

    @Test
    public void testTurnRightWhenRobotDirectionRight() {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        robot.turnRight();
        Assert.assertEquals("Wrong turnRight logic", Direction.DOWN, robot.getDirection());
    }

    @Test
    public void testStepForwardWhenDirectionUp() {
        Robot robot = new Robot(Direction.UP, 0, 0);
        robot.stepForward();
        Assert.assertEquals(1, robot.getCoordinateY());
    }

    @Test
    public void testStepForwardWhenDirectionDown() {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        robot.stepForward();
        Assert.assertEquals(-1, robot.getCoordinateY());
    }

    @Test
    public void testStepForwardWhenDirectionLeft() {
        Robot robot = new Robot(Direction.LEFT, 0, 0);
        robot.stepForward();
        Assert.assertEquals(-1, robot.getCoordinateX());
    }

    @Test
    public void testStepForwardWhenDirectionRight() {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        robot.stepForward();
        Assert.assertEquals(1, robot.getCoordinateX());
    }
}
