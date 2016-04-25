package module3.nechiporenko;

public class Rectangle {
    private int side1;
    private int side2;

    private int area;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public int getSide1() {
        return side1;
    }
    public int getSide2() {
        return side2;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
