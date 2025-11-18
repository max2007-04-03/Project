public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("Width and height must be positive values.");
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return this.width * this.height; 
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with width = " + this.width + " and height = " + this.height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Error: Width must be a positive number.");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: Height must be a positive number.");
        }
    }
}
