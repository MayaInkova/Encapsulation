package figures;

public class Circle extends Shape {

    public Circle(double radius) {
        super(radius, radius);
    }

    @Override
    public double calculateSurface() {
        return Math.PI * width * width; // width и height са радиуса
    }
}
