public class Ellipse extends Shape
{
    protected int radiusx, radiusy;
    public Ellipse()
    {
        super();
        radiusx = defaultSize;
        radiusy = defaultSize;
    }

    public Ellipse(int xpos, int ypos, int radiusx, int radiusy)
    {
        super(xpos, ypos);
        this.radiusx = radiusx;
        this.radiusy = radiusy;
    }
    public  String toString()
    {
        return "Ellipse radiusx = "+radiusx+" , radiusy = "+radiusy+" "+super.toString();
    }
}
