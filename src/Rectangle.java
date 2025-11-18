public class Rectangle extends Shape {
    // 1. ENCAPSULATION:
    // Private fields
    private double width;
    private double height;

    // 2. CONSTRUCTOR:

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Прямокутник";
    }

    // 3. UNIQUE IMPLEMENTATION
    @Override
    public double getArea() {
        // Формула площі прямокутника: ширина * висота
        return this.width * this.height;
    }
}