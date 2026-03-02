import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int randomNumber = generator.nextInt(10) + 1;
        int guess = 0;

        String trash = "";
        boolean done = false;

        do
        {
            System.out.print("Guess a number between 1 and 10: ");

            if(in.hasNextInt())
            {
                guess = in.nextInt();
                in.nextLine();

                if(guess >= 1 && guess <= 10)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Guess must be between 1 and 10.");
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("\nYou entered: " + trash);
                System.out.println("You must enter a valid integer!");
            }

        } while(!done);

        System.out.println("\nThe random number was: " + randomNumber);

        if(guess > randomNumber)
        {
            System.out.println("Your guess was too high!");
        }
        else if(guess < randomNumber)
        {
            System.out.println("Your guess was too low!");
        }
        else
        {
            System.out.println("You were on the money!");
        }

        in.close();
    }
}