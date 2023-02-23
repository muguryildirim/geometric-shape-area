import java.util.Scanner;

import static java.lang.System.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(in);

        String options = "Options...\n"
                +"1. Calculate the Square's Area\n"
                +"2. Calculate the Triangle's Area\n"
                +"3. Calculate the Circle's Area\n"
                + "For Quitting = q";

        while(true)
        {
            out.println(options);
            out.print("Which shape's area do you want to calculate? = ");
            String shapeType = scanner.nextLine();
            Shape shape = null;
            if (shapeType.equals("q"))
            {
                out.println("Exiting ... ");
                break;
            }
            else if (shapeType.equals("1"))
            {
                out.print("Square's side equals to = ");
                int side = scanner.nextInt();
                scanner.nextLine();

                shape = new Square("Square1", side);

                shape.calculateArea();

            }
            else if (shapeType.equals("2"))
            {

                out.print("Side 1 : ");
                int side1 = scanner.nextInt();
                out.print("Side 2 : ");
                int side2 = scanner.nextInt();
                out.print("Side 3 : ");
                int side3 = scanner.nextInt();
                scanner.nextLine();

                shape = new Triangle("Triangle 1", side1, side2, side3);

                shape.calculateArea();

            }
            else if (shapeType.equals("3"))
            {
                out.print("Circle's radius = " );
                int radius = scanner.nextInt();
                scanner.nextLine();

                shape = new Circle("Circle 1", radius);

                shape.calculateArea();

            }
            else
            {
                out.println("Invalid option!!");
            }


        }
    }

}