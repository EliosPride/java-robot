package core.basesyntax;

/**
 * <p>На игровом поле находится робот. Позиция робота на поле описывается двумя
 * целочисленным координатами: X и Y.
 * Ось X смотрит слева направо, ось Y — снизу вверх.(Помните, как рисовали
 * графики функций в школе?)
 * В начальный момент робот находится в некоторой позиции на поле.
 * Также известно, куда робот смотрит: вверх, вниз, направо или налево.
 * Ваша задача — привести робота в заданную точку игрового поля.
 * Реализуйте метод moveRobot()</p>
 */
public class FieldXY {

    public void moveRobot(Robot robot, int coordinateX, int coordinateY) {
        int[] toX = new int[Math.abs(coordinateX - robot.getCoordinateX())];
        int[] toY = new int[Math.abs(coordinateY - robot.getCoordinateY())];
        for (int i = 0; i < toX.length; i++) {
            if (coordinateX - (robot.getCoordinateX() + 1) >= coordinateX - robot.getCoordinateX()) {
                robot.turnLeft();
            }
            if (coordinateX - (robot.getCoordinateX() + 1) < coordinateX - robot.getCoordinateX()) {
                robot.stepForward();
            }
            for (int a = 0; a < toY.length; a++) {
                if (coordinateY - (robot.getCoordinateY() + 1) >= coordinateY - robot.getCoordinateY()) {
                    robot.turnRight();
                }
                if (coordinateY - (robot.getCoordinateY() + 1) < coordinateY - robot.getCoordinateY()) {
                    robot.stepForward();
                }
            }
        }
    }
}
