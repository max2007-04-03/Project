public class Triangle extends Shape {

    private double base;
    private double height;

    // Конструктор с проверкой входных данных
    public Triangle(double base, double height) {
        if (base <= 0 || height <= 0) {
            throw new IllegalArgumentException("Base and height must be positive values.");
        }
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height; // Формула площади треугольника
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle with base = " + this.base + " and height = " + this.height);
    }

    // Геттер для основы
    public double getBase() {
        return base;
    }

    // Сеттер для основы
    public void setBase(double base) {
        if (base > 0) {
            this.base = base;
        } else {
            System.out.println("Error: Base must be a positive number.");
        }
    }

    // Геттер для высоты
    public double getHeight() {
        return height;
    }

    // Сеттер для высоты
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Error: Height must be a positive number.");
        }
    }
}