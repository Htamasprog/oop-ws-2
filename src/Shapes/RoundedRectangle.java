package Shapes;

public class RoundedRectangle extends Rectangle{
    private double roundRadius;

    public RoundedRectangle(int width, int height, int size) {
        super(height, width);
    }

    public RoundedRectangle(int width, int height, int size, double roundRadius) {
        super(height, width);
        this.roundRadius = roundRadius;
    }

    public void setRoundRadius(double roundRadius) {
        this.roundRadius = roundRadius;
    }

    public double getRoundRadius() {
        return roundRadius;
    }


        //    (width * height) - (4 * (radius * radius)) + (radius * radius * PI)
    //override calculateArea method

    @Override
    public int calculateArea() {
        return super.calculateArea() - 4 * roundRadius * roundRadius + (2 * roundRadius * Math.PI);
    }
}
