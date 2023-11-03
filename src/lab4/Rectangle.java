package lab4;

public class Rectangle {

    private int width;
    private int length;

    public int aria() {
        return width * length;
    }

    public int perimetru() {
        return width * 2 + length * 2;
    }

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
