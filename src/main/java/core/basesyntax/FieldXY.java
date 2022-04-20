package core.basesyntax;

public class FieldXY {


    public void moveRobot(Robot robot, int coordinateX, int coordinateY) {
        Direction moveDirectionX = robot.getCoordinateX() > coordinateX ? Direction.LEFT : Direction.RIGHT;
        while (moveDirectionX != robot.getDirection()) {
            robot.turnLeft();
        }
        while (robot.getCoordinateX() != coordinateX) {
            robot.stepForward();
        }
        Direction moveDirectionY = robot.getCoordinateY() > coordinateY ? Direction.DOWN : Direction.UP;
        while (moveDirectionY != robot.getDirection()) {
            robot.turnRight();
        }
        while (robot.getCoordinateY() != coordinateY) {
            robot.stepForward();
        }
    }
}
