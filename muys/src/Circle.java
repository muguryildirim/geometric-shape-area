import static java.lang.System.*;

public class Circle extends Shape
{
    private int radius;

    public Circle(String name, int radius)
    {
        super(name);
        this.radius = radius;
    }
    @Override
    public void calculateArea()
    {
        out.println(getName() + " s area is = " + (Math.PI * Math.pow(radius,2)));
    }
}
