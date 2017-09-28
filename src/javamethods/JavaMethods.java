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
        String check1, check2, check3;
        String yes = "yes";
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from the following: ");
        System.out.println("1. Build a roof");
        System.out.println("2. Build a base");
        System.out.println("3. Build a walk");
        if (check1.equals(yes) && check2.equals(yes) && check3.equals(yes)){
            System.out.println("4. Create the house!");
        }
        System.out.println("0. Exit program");
        select = input.nextInt();
        switch (select) {
            case 1:
                select = 1;
                addRoof();
                check1 = "yes";
                break;
            case 2:
                select = 2;
                addBase();
                check2 = "yes";
                break;
            case 3:
                select = 3;
                addWalk();
                check3 = "yes";
                break;
            case 4:
                select = 4;
                
            case 5:
                select = 0;
                System.exit(0);

        }
        
    }

    /**
     * This method adds the roof
     *
     *
     */
    public static void addRoof() {
        System.out.println("Roof built! Memory stored for final build.");
        startUp();
    }

    /**
     * This method adds the base
     *
     *
     */
    public static void addBase() {
        System.out.println("Base built! Memory stored for final build.");
        startUp();
    }

    /**
     * This method adds the walk
     *
     *
     */
    public static void addWalk() {
        System.out.println("Walk built! Memort stored for final build");
        startUp();
    }
    
    /**
     * 
     * 
     * 
     */
    public static void finalBuild(){
        System.out.println("");
        System.out.println("");
        System.out.println("");
    }
}
