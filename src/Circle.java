public class Circle extends Shape {

    private double radius;

    // 2. CONSTRUCTOR:
    // This method is called when we write 'new Circle(10.0)'
    // It forces us to provide the radius when creating a Circle instance.
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Коло";
    }

    // 3. IMPLEMENTATION OF ABSTRACT METHOD

    @Override
    public double getArea() {
        // Circle area formula: PI * r^2

        return Math.PI * this.radius * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double newRadius) {

        if (newRadius > 0) {
            this.radius = newRadius;
        } else {
            System.out.println("Помилка: Радіус не може бути нульовим або негативним.");
        }

    }
}