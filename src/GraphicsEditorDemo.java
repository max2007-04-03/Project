import java.util.Scanner;

public class GraphicsEditorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShapeCollection shapeCollection = new ShapeCollection();

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add a Circle");
            System.out.println("2. Add a Rectangle");
            System.out.println("3. Add a Triangle");
            System.out.println("4. Add an Ellipse");
            System.out.println("5. Show All Shapes");
            System.out.println("6. Exit");

            int option = readPositiveInteger(scanner, "Enter your choice: ");
            switch (option) {
                case 1 -> createCircle(scanner, shapeCollection);
                case 2 -> createRectangle(scanner, shapeCollection);
                case 3 -> createTriangle(scanner, shapeCollection);
                case 4 -> createEllipse(scanner, shapeCollection); // Новый пункт меню для эллипса
                case 5 -> shapeCollection.showAllShapes();
                case 6 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid option. Try again.");
            }
        }
    }

    // Метод для добавления круга
    private static void createCircle(Scanner scanner, ShapeCollection shapeCollection) {
        double radius = readPositiveDouble(scanner, "Enter radius: ");
        shapeCollection.addShape(new Circle(radius));
        System.out.println("Circle added successfully!");
    }

    // Метод для добавления прямоугольника
    private static void createRectangle(Scanner scanner, ShapeCollection shapeCollection) {
        double width = readPositiveDouble(scanner, "Enter width: ");
        double height = readPositiveDouble(scanner, "Enter height: ");
        shapeCollection.addShape(new Rectangle(width, height));
        System.out.println("Rectangle added successfully!");
    }

    // Метод для добавления треугольника
    private static void createTriangle(Scanner scanner, ShapeCollection shapeCollection) {
        double base = readPositiveDouble(scanner, "Enter base: ");
        double height = readPositiveDouble(scanner, "Enter height: ");
        shapeCollection.addShape(new Triangle(base, height));
        System.out.println("Triangle added successfully!");
    }

    // Метод для добавления эллипса
    private static void createEllipse(Scanner scanner, ShapeCollection shapeCollection) {
        double majorAxis = readPositiveDouble(scanner, "Enter major axis (width): ");
        double minorAxis = readPositiveDouble(scanner, "Enter minor axis (height): ");
        shapeCollection.addShape(new Ellipse(majorAxis, minorAxis));
        System.out.println("Ellipse added successfully!");
    }

    // Чтение положительного целого числа
    private static int readPositiveInteger(Scanner scanner, String message) {
        int value;
        do {
            System.out.print(message);
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Please enter a valid integer.");
                System.out.print(message);
                scanner.next();
            }
            value = scanner.nextInt();
            if (value <= 0) {
                System.out.println("Error: Value must be positive.");
            }
        } while (value <= 0);
        return value;
    }

    // Чтение положительного вещественного числа
    private static double readPositiveDouble(Scanner scanner, String message) {
        double value;
        do {
            System.out.print(message);
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Please enter a valid number.");
                System.out.print(message);
                scanner.next();
            }
            value = scanner.nextDouble();
            if (value <= 0) {
                System.out.println("Error: Value must be positive.");
            }
        } while (value <= 0);
        return value;
    }
}