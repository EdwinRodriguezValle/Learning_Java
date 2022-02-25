/*
Title: Calculator of area of a square
Exercise:  3
Name: Edwin Rodriguez Valle
Goal of the exercise: Calculate the area of a square using method.
*/
package Controller;
//library
import java.util.Scanner;

public class SquereArea_3_1 {

    public static void main(String[] args) {

        // Introduction of the luancher
        System.out.println("This app calculate for you the area of your square");

        // Variables
        Scanner input = new Scanner(System.in);
        double lengthArea;

        // Asking input
        System.out.println("Please, type the a side of your square in meters? ");
        lengthArea = input.nextDouble();

        System.out.println("The area of your square is: " + AreaSquare(lengthArea)+ "m2");
        System.out.println("Bye!!!");

    }// end main
    public static double AreaSquare(double mpLength ){
        double area;
        area = mpLength* mpLength;
        return area;
    } // end AreaSquare
}
