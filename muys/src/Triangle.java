import static java.lang.System.*;

public class Triangle extends Shape
{
    private int firstSide;
    private int secondSide;
    private int thirdSide;
    public Triangle(String name, int firstSide, int secondSide, int thirdSide) {
        super(name);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    void calculateArea()
    {
        double uu = (firstSide + secondSide + thirdSide) / 2.0;

        double triangleArea = Math.sqrt(uu * (uu - firstSide) * (uu - secondSide) * (uu - thirdSide));
        out.println(getName() + " s area is = " + triangleArea);
    }
}
