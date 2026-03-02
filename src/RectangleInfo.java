import java.util.Scanner;

public class RectangleInfo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double width = 0;
        double height = 0;

        String trash = "";
        boolean done = false;

        done = false;
        do
        {
            System.out.print("Enter the width of the rectangle: ");

            if(in.hasNextDouble())
            {
                width = in.nextDouble();
                in.nextLine();

                if(width > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Width must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }

        }while(!done);

        done = false;
        do
        {
            System.out.print("Enter the height of the rectangle: ");

            if(in.hasNextDouble())
            {
                height = in.nextDouble();
                in.nextLine();

                if(height > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Height must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }

        }while(!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.printf("\nArea: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);

        in.close();
    }
}