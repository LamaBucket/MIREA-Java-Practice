package Task6;

public class Tester {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(1, 2, 3, 4, 15);

        System.out.println(circle);

        circle.moveUp();
        System.out.println(circle);

        IMovable anotherPointer = circle;

        
        circle.moveUp();
        System.out.println(anotherPointer);
    }
}
