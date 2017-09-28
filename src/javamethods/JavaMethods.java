/*
 * Jordan Klug
 * September 28, 2017
 * Create a house application
 */
package javamethods;

import java.util.Scanner;

/**
 *
 * @author joklu7045
 */
public class JavaMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startUp();
    }

    /**
     * This method is called by the main method to be able to run the program
     * multiple times
     *
     *
     */
    public static void startUp() {
        int select = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from the following: ");
        System.out.println("1. Build a roof");
        System.out.println("2. Build a base");
        System.out.println("3. Build a walk");
        System.out.println("4. Exit program");
        select = input.nextInt();
        switch (select) {
            case 1:
                select = 1;
                addRoof(5);
                break;
            case 2:
                select = 2;
                addBase();
                break;
            case 3:
                select = 3;
                addWalk();
                break;
            case 4:
                select = 4;
                System.exit(0);

        }
    }

    /**
     * This method adds the roof
     *
     *
     */
    public static void addRoof(int style) {
        System.out.println("1");
        startUp();
    }

    /**
     * This method adds the base
     *
     *
     */
    public static void addBase() {
        System.out.println("2");
        startUp();
    }

    /**
     * This method adds the walk
     *
     *
     */
    public static void addWalk() {
        System.out.println("3");
        startUp();
    }

}
