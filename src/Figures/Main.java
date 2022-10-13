package Figures;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(30), new Triangle(10, 5), new Square(15)};
        AreaCalculator areaCalculator = new AreaCalculator(figures);
        areaCalculator.writeSummaryArea();
    }
}

class AreaCalculator{
    Figure[] figures;

    public AreaCalculator(Figure[] figures) {
        this.figures = figures;
    }

    public void writeSummaryArea(){
        double summaryArea = 0;
        for (Figure figure: figures) {
            summaryArea += figure.getArea();
        }
        System.out.println("The total area of all figures is " +  summaryArea + " square meters");
    }
}
