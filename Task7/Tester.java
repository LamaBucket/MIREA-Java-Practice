package Task7;

public class Tester {
    public static void main(String[] args) {
        MovableRectangle rect = new MovableRectangle(10, 10, 35, 40, 10, 20);
        System.out.println(rect);

        rect.moveDown();
        System.out.println(rect);

        rect.moveLeft();
        System.out.println(rect);

        rect.moveUp();
        System.out.println(rect);

        rect.moveRight();
        System.out.println(rect);
    }
}
