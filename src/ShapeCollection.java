import java.util.ArrayList;
import java.util.Scanner;

class ShapeCollection {
    private ArrayList<Shape> shapes;

    public ShapeCollection() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void showAllShapes() {
        if (shapes.isEmpty()) {
            System.out.println("No shapes available.");
            return;
        }
        System.out.println("\n--- List of all Shapes ---");
        for (Shape shape : shapes) {
            System.out.println("Shape: " + shape.getName() + ", Color: " + shape.getColor() +
                    ", Area: " + String.format("%.2f", shape.getArea()));
            shape.draw();
        }
    }
}