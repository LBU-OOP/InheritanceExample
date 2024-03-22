import java.awt.*;

public class Shape
{
    public final int defaultXpos = 0;
    public final int defaultYpos = 0;
    public final int defaultSize = 100;

    protected int xpos, ypos;
       public Shape()
    {
        xpos = defaultXpos;
        ypos = defaultYpos;
    }

    public Shape(int xpos, int ypos)
    {
        this.xpos = xpos;
        this.ypos = ypos;
    }
    public String toString()
    {
        return " at position "+xpos+" , "+ypos;
    }
}
