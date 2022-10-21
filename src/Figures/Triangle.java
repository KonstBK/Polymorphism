package Figures;

public class Triangle implements Figure {
    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }


    @Override
    public double getArea() {
        return (side * height) / 2;
    }
}
