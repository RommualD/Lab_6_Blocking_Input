import java.util.Scanner;

public class CtoFConverter {

    public static void main(String[] args) {

        double celsius;
        double fahrenheit;
        Scanner in = new Scanner(System.in);
        boolean done = false;

        do {

            System.out.print("Enter temperature in Celsius: ");

            if (in.hasNextDouble()) {
                celsius = in.nextDouble();

                fahrenheit = (celsius * 9 / 5) + 32;

                System.out.println("Temperature in Fahrenheit: " + fahrenheit);
                done = true;

            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                in.next(); // clear bad input
            }

        } while (!done);

        in.close();
    }
}