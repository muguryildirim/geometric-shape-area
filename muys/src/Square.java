import static java.lang.System.*;

public class Square extends Shape
{
    private int side;

    public Square(String name, int side)
    {
        super(name);
        this.side = side;
    }
    @Override
    void calculateArea()
    {
        out.println(getName() + " s area is = " + (Math.pow(side,2)));
    }
}
