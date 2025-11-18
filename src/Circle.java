public class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be positive.");
        }
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius = " + this.radius);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {
            this.radius = newRadius;
        } else {
            System.out.println("Error: Radius cannot be zero or negative.");
        }
    }

}
