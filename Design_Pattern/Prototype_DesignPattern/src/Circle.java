public class Circle implements Shape
{
    private String color;

    public  Circle(String color)
    {
        this.color=color;
    }

    @Override
    public Shape clone() {
        return new Circle(this.color);
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color=color;
    }

    @Override
    public void draw() {
        System.out.println("Draw "+color+" circle");
    }
}
