package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Robot anton = new Robot(Direction.UP, 0, 0);
        FieldXY field = new FieldXY();
        field.moveRobot(anton, 2, 2);
        System.out.println(anton);
        Robot veniamin = new Robot(Direction.LEFT, 4, 4);
        field.moveRobot(veniamin, 1, 1);
        System.out.println(veniamin);
        Robot artur = new Robot(Direction.RIGHT, 1, -5);
        field.moveRobot(artur, -8, -5);
        System.out.println(artur);
        Robot ivan = new Robot(Direction.DOWN, 0, 0);
        field.moveRobot(ivan, 0, 0);
        System.out.println(ivan);
    }
}
