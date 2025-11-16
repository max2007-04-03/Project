public abstract class Shape implements IDrawable {

    private String color;

    public abstract String getName();

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public void draw() {}

    public abstract double getArea();

}



