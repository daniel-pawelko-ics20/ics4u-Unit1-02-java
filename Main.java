/*
* Calculate energy
*
* @author  Daniel
* @version 1.0
* @since   2022-09-14
*/

import java.util.Scanner;

/**
* Program calculates energy with mass input.
*/
final class Main {

    /**
    * Prevent instantiation.
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Program calculates energy with mass input.
    *
    * @param args No args will be used
    */

    public static void main(final String[] args) {
        // Defining variables
        final Scanner s = new Scanner(System.in);
        final double speed = 2.998 * Math.pow(10, 8);

        // Getting user input
        System.out.print("Mass of object(kg): ");
        final String inpString = s.nextLine();

        try {
            // Convert string to integer
            final float mass = Float.valueOf(inpString);

            if (mass <= 0) {
                System.out.println("Mass cannot be negative");
            } else {
                // Calculations
                final double enegry = mass * Math.pow(speed, 2);

                // Output
                System.out.println(mass + " kg of mass would produce "
                    + enegry + "J of energy");
            }

        } catch (NumberFormatException ex) {
            System.out.println("Input invalid :(");
        } finally {
            // Done
            System.out.println("\nDone");
        }
    }
}
