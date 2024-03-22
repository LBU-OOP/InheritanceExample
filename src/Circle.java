public class Circle extends Ellipse
{
    public Circle()
    {
        super();
    }

    public Circle(int xpos, int ypos, int radius)
    {
        super(xpos, ypos, radius, radius);
    }

    public  String toString()
    {
        return "Circle "+super.toString();
    }
}
