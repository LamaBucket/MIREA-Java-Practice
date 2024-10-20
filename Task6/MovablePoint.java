package Task6;

public class MovablePoint implements IMovable {

    private int _x;
    private int _y;

    private int _xSpeed;
    private int _ySpeed;


    public int GetX(){
        return _x;
    }

    public int GetY(){
        return _y;
    }


    @Override
    public void moveUp() {
        _y += _ySpeed;
    }

    @Override
    public void moveDown() {
        _y -= _ySpeed;
    }

    @Override
    public void moveLeft() {
        _x -= _xSpeed;
    }

    @Override
    public void moveRight() {
        _x += _xSpeed;
    }

    @Override
    public String toString(){
        return "(" + _x + " " + _y + ")";
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super();
        _x = x;
        _y = y;

        _xSpeed = xSpeed;
        _ySpeed = ySpeed;
    }
}
