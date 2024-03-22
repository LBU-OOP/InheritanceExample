public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        new Main();
    }

    public Main()
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(100,150,200);
        c1.radiusx = 100;   //even though this is defined as "protected" it is still accesible here because class Main is in the same package as Class Shape
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(250, 10, 50, 200);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("end");

    }
}