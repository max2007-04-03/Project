public class Ellipse extends Shape {

    private double width;
    private double height;

    public Ellipse(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive values.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Ellipse";
    }

    @Override
    public double getArea() {
        return this.width * this.height * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Ellipse with width = " + this.width + " and height = " + this.height);
    }
}