package _01_Abstraction._01_Abstraction_lab._02_Point_In_Rectangle;

public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public Point getBottomLeft() {
        return bottomLeft;
    }

    public Point getTopRight() {
        return topRight;
    }

    public boolean contains(Point point) {
        return  point.getX() >= bottomLeft.getX() && point.getY() >= bottomLeft.getY()
                && point.getX() <= topRight.getX() && point.getY() <= topRight.getY();
    }
}
