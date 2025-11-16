public class Circle extends Shape {

    private double radius;

    // 2. ? КОНСТРУКТОР:
    // Цей метод викликається, коли ми пишемо 'new Circle(10.0)'
    // Він змушує нас надати радіус при створенні.
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Коло";
    }

    // 3. ? РЕАЛІЗАЦІЯ АБСТРАКТНОГО МЕТОДУ
    @Override
    public double getArea() {
        // Формула площі кола: PI * r^2
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