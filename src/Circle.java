public class Circle extends Shape
{
    protected int radius;
    public Circle()
    {
        super();
        radius = 100;

    }

    public Circle(int xpos, int ypos, int radius)
    {
        super(xpos, ypos);
        this.radius = radius;

    }
}
