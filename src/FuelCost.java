import java.util.Scanner;

public class FuelCost
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double mpg = 0;
        double costPerGallon = 0;
        double tankSize = 0;

        String trash = "";
        boolean done = false;

        done = false;
        do
        {
            System.out.print("Enter the miles per gallon: ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();

                if(mpg > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("MPG must be greater than 0.");
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
            System.out.print("Enter the cost per gallon: ");

            if(in.hasNextDouble())
            {
                costPerGallon = in.nextDouble();
                in.nextLine();

                if(costPerGallon > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Cost must be greater than 0.");
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
            System.out.print("Enter the tank size (gallons): ");

            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();

                if(tankSize > 0)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Tank size must be greater than 0.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid number!");
            }

        }while(!done);

        double costToDrive100Miles = (100 / mpg) * costPerGallon;
        double distanceWithFullTank = tankSize * mpg;

        System.out.printf("\nCost to drive 100 miles: $%.2f\n", costToDrive100Miles);
        System.out.printf("Distance with full tank: %.2f miles\n", distanceWithFullTank);

        in.close();
    }
}