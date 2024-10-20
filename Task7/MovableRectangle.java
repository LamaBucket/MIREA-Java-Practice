package Task7;

import Task6.IMovable;
import Task6.MovablePoint;

public class MovableRectangle implements IMovable {

    private MovablePoint _topLeft;
    private MovablePoint _bottomRight;


    @Override
    public void moveUp() {
        _topLeft.moveUp();
        _bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        _topLeft.moveDown();
        _bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        _topLeft.moveLeft();
        _bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        _topLeft.moveRight();
        _bottomRight.moveRight();
    }

    @Override
    public String toString(){
        return "Top Left Point: " + _topLeft.toString() + " Bottom Right Point: " + _bottomRight.toString();
    }

    
    public MovableRectangle(int topLeftX, int topLeftY, int bottomRightX, int bottomRightY, int xSpeed, int ySpeed) {
        super();
        _bottomRight = new MovablePoint(bottomRightX, bottomRightY, xSpeed, ySpeed);
        _topLeft = new MovablePoint(topLeftX, topLeftY, xSpeed, ySpeed);
    }
    
}
