public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Main obj = new Main();
    }

    public Main()
    {
        Circle c1 = new Circle();
        Circle c2 = new Circle(100,150,200);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(250, 10, 50, 200);
        System.out.println("end");

    }
}