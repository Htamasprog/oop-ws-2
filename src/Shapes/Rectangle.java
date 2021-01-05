package Shapes;

public class Rectangle {

    private int height;
    private int width;
    private int size;

    public Rectangle(int height, int width, int size) {
        this.height = height;
        this.width = width;
        this.size = size;
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSize() {
        return size;
    }

    public int calculateArea(int height, int width){
        this.height = height;
        this.width = width;

        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", size=" + size +
                '}';
    }

    public void printRectangle() {
        
    }
}
