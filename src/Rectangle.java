public class Rectangle extends Shape
{
    int width, height;
    public Rectangle()
    {
        super();
        width = defaultSize; //note these come from Shape class
        height = defaultSize;

    }

    public Rectangle(int xpos, int ypos, int width, int height)
    {
        super(xpos, ypos);
        this.width = width; //width and height destined for here, xpos/ypos for Shape
        this.height = height;

    }
    public  String toString()
    {
        return "Rectangle width = "+width+" , height = "+height+" "+super.toString();
    }
}
