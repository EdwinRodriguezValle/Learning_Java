/*
Title: Body Mass Index Calculator
Exercise:  2.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Calculate the BMI of somebody
*/

package Controller;

// library
import java.util.Scanner;

public class BMICalculator_2_1 {
    public static void main(String[] args) {
        // Variables
        Scanner input = new Scanner(System.in);
        double height;
        double weight;
        final int bmiStandar = 25;
        double bmiUser;

        // Asking input from the user.
        System.out.println("How tall are you in centimeters? ");
        height = input.nextDouble();
        System.out.println("How much do you weight in kilograms? ");
        weight = input.nextDouble();

        //Transforming to height from centimeter to meters
        double heightMeters = height/100;

        //Calculating the BMI= Weight kg/(height m * height m)

        bmiUser = Math.round( weight/(heightMeters * heightMeters));


        // Applying if condition to see if the user is inside the standard
        if(bmiUser < bmiStandar){
            System.out.println("Your are healthy person and your BMI is:" + bmiUser);
            System.out.println("Keep taking care of your healthy!!!");
        } else{
            System.out.println("Your BMI is: " + bmiUser + " are above the standers parameter. ");

        }

    }// end main
}
