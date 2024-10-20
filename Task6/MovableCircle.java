package Task6;

public class MovableCircle implements IMovable {
    
    private MovablePoint _center;

    private int _radius;

    public int GetX(){
        return _center.GetX();
    }

    public int GetY(){
        return _center.GetY();
    }

    public int GetRadius(){
        return _radius;
    }


    @Override
    public void moveUp() {
        _center.moveUp();
    }

    @Override
    public void moveDown() {
        _center.moveDown();
    }

    @Override
    public void moveLeft() {
        _center.moveLeft();
    }

    @Override
    public void moveRight() {
        _center.moveRight();
    }

    @Override
    public String toString(){
        return _center.toString() + " Radius: " + _radius;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super();

        _center = new MovablePoint(x, y, xSpeed, ySpeed);
        _radius = radius;
    }

}
