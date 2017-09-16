package mpg2;


/*
* This program calculate miles per gallon
*/

import java.util.Scanner;

public class Mpg2 {

    /**
    * The program starts in the main function
    *@param args the command line arguments
    */
    public static void main(String[]args){
        //print out the welcome message
        System.out.println();
        System.out.println("This program calculates miles per gallon");

        // prompt to enter the miles
        System.out.println("\nMiles Traveled:");

        // create an input file for the console
        Scanner inFile;
        inFile = new Scanner(System.in);

        //get the value entered for miles
        double miles = inFile.nextDouble();

        //prompt to enter gallons used
        System.out.println("\nGallons Used:");

        //read the value of the next line typed in console
        double gallons = inFile.nextDouble();

        //calculate miles per gallon
        double milesPerGallon = miles / gallons;

        //display miles per gallon to the console
        System.out.println("\n******************************************************"+"************************");
        System.out.println("\tMiles per Gallon: " + milesPerGallon);
        System.out.println("********************************************************" + "*********************\n");
    }

}
