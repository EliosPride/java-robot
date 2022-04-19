package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

public class FieldXYTest {
    @Test
    public void testMoveRobotWhenMoveDirectionUpXCoordinate() {
        Robot robot = new Robot(Direction.UP, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, 10, 0);
        Assert.assertEquals(10, robot.getCoordinateX());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionDownXCoordinate() {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, -10, 0);
        Assert.assertEquals(-10, robot.getCoordinateX());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionRightXCoordinate() {
        Robot robot = new Robot(Direction.RIGHT, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, Integer.MAX_VALUE, 0);
        Assert.assertEquals(Integer.MAX_VALUE, robot.getCoordinateX());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionLeftXCoordinate() {
        Robot robot = new Robot(Direction.LEFT, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, -100522, 0);
        Assert.assertEquals(-100522, robot.getCoordinateX());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionUpCoordinateY() {
        Robot robot = new Robot(Direction.UP, 0, 22);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, 0, 1);
        Assert.assertEquals(1, robot.getCoordinateY());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionDownCoordinateY() {
        Robot robot = new Robot(Direction.DOWN, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, 0, -22);
        Assert.assertEquals(-22, robot.getCoordinateY());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionRightCoordinateY() {
        Robot robot = new Robot(Direction.RIGHT, 0, 2);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, 0, Integer.MAX_VALUE);
        Assert.assertEquals(Integer.MAX_VALUE, robot.getCoordinateY());
    }

    @Test
    public void testMoveRobotWhenMoveDirectionLeftCoordinateY() {
        Robot robot = new Robot(Direction.LEFT, 10, 12);
        FieldXY field = new FieldXY();
        field.moveRobot(robot, 10, -222522);
        Assert.assertEquals(-222522, robot.getCoordinateY());
    }
}
