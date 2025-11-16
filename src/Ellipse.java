public class Ellipse extends Shape {

    private double width;
    private double height;

    public Ellipse(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Ελ³ορ";
    }

    @Override
    public double getArea() {
        return this.width * this.height * Math.PI;
    }



}