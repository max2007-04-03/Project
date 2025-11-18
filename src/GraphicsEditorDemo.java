public class GraphicsEditorDemo {
    public static void main(String[] args) {

        // 1. Creating our tool

        ShapePrinter printer = new ShapePrinter();

        // 2. Creating different shapes
        // Note the polymorphism:
        // We create a specific 'new Circle()',
        // but store it in a variable of the base type 'Shape'.
        Shape shape1 = new Circle(10.0);
        Shape shape2 = new Rectangle(5.0, 10.0);
        Shape shape3 = new Star();
        Shape shape4 = new Ellipse(5 , 5);
        Circle myCircle = new Circle(10.0);
        System.out.println("Початкова площа: " + myCircle.getArea());
        myCircle.setRadius(20.0);
        System.out.println("Нова площа (20): " + myCircle.getArea());
        System.out.println("--- Спроба встановити -5 ---");
        myCircle.setRadius(-5.0);
        System.out.println("Площа після спроби: " + myCircle.getArea());
        // 3. Pass them to our "printer"
        // printer doesn't know what shape1 is,
        // but it knows it is a Shape.


        printer.printShapeName(shape1);  // Output: The name of this shape is: Circle
        printer.printShapeName(shape2);  // Output: The name of this shape is: Triangle
        printer.printShapeName(shape3);   // Output: The name of this shape is: Star

    }
}