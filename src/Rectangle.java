public class Rectangle extends Shape {
    // 1. ? ІНКАПСУЛЯЦІЯ:
    // Приватні поля
    private double width;
    private double height;

    // 2. ? КОНСТРУКТОР:
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public String getName() {
        return "Прямокутник";
    }

    // 3. ? РЕАЛІЗАЦІЯ (своя, унікальна!)
    @Override
    public double getArea() {
        // Формула площі прямокутника: ширина * висота
        return this.width * this.height;
    }
}