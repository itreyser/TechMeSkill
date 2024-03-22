package lesson7;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double square() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return height + width + height + width;
    }
}
