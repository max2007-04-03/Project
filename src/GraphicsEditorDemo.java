public class GraphicsEditorDemo {
    public static void main(String[] args) {

        // 1. Створюємо наш інструмент
        ShapePrinter printer = new ShapePrinter();

        // 2. Створюємо різні фігури
        // Зверніть увагу на поліморфізм:
        // Ми створюємо конкретне 'new Circle()',
        // але зберігаємо його у змінну базового типу 'Shape'.
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
        // 3. Передаємо їх нашому "принтеру"
        // printer не знає, що таке shape1,
        // але він знає, що це Shape.

        printer.printShapeName(shape1);  // Виведе: Назва цієї фігури: Коло
        printer.printShapeName(shape2);  // Виведе: Назва цієї фігури: Трикутник
        printer.printShapeName(shape3);  // Виведе: Назва цієї фігури: Зірка
    }
}