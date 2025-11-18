import java.util.Random;

public abstract class Shape implements IDrawable {

    private String color;

    public Shape() {
        this.color = generateRandomColor();
    }

    public abstract String getName();

    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    private String generateRandomColor() {
        String[] colors = {"Red", "Blue", "Green", "Yellow", "Purple", "Orange"};
        Random random = new Random();
        return colors[random.nextInt(colors.length)];
    }
}
