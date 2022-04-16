package core.basesyntax;

public class Robot {
    private Direction direction;
    private int coordinateX;
    private int coordinateY;

    public Robot(Direction direction, int coordinateX, int coordinateY) {
        this.direction = direction;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
        // текущее направление взгляда
    }

    public int getCoordinateX() {
        return coordinateX;
        // текущая координата X
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    public void turnLeft() {
        switch (direction) {
            case UP: direction = Direction.LEFT;
            case DOWN: direction = Direction.RIGHT;
            case LEFT: direction = Direction.DOWN;
            case RIGHT: direction = Direction.UP;
        }
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        switch (direction) {
            case UP: direction = Direction.RIGHT;
            case DOWN: direction = Direction.LEFT;
            case LEFT: direction = Direction.UP;
            case RIGHT: direction = Direction.DOWN;
        }
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (direction) {
            case UP: coordinateX += 1;
            case DOWN: coordinateX -= 1;
            case RIGHT: coordinateY += 1;
            case LEFT: coordinateY -= 1;
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }
}
