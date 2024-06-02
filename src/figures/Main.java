package figures;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Rectangle(5, 10),
                new Triangle(6, 8),
                new Circle(7),
                new Rectangle(2, 3),
                new Triangle(3, 4),
                new Circle(5),
                new Rectangle(10, 15),
                new Triangle(7, 10),
                new Circle(3),
                new Rectangle(4, 6)
        };

        double[] areas = new double[shapes.length];

        for (int i = 0; i < shapes.length; i++) {
            areas[i] = shapes[i].calculateSurface();
        }

        for (double area : areas) {
            System.out.println(area);
        }
    }
}

