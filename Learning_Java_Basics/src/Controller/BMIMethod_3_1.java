/*
Title: Body Mass Index Calculator
Exercise:  2.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Calculate the BMI of somebody
*/
package Controller;
//library
import java.util.Scanner;

public class BMIMethod_3_1 {
    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        int height;
        double weight;
        double bmiUsers;

        // Asking input

        System.out.println("Please type your height in centimeters? ");
        height = input.nextInt();
        System.out.println("Please type your weight in kilograms? ");
        weight = input.nextDouble();

        //Giving values to the method
        bmiUsers = BMIcalculator(height, weight);

        //Printing the value of the BMI.
        System.out.println("Your body mass index is " + bmiUsers );
        System.out.println();
        String category = DefiningCategory(bmiUsers);

        System.out.println("Your are " + category + "\nGood Bye!!!");


    }//end main

    public static double BMIcalculator(int mpHeight, double mpWeight){
        //transforming centimeter in meters
        double height = mpHeight/100.0;
        //formula to calculate:  BMI = Weight kg/(height m * height m)
        double bmi = Math.round(mpWeight / Math.pow(height, 2));// In this case Math.pow is an exponential method.
        //It required to indicated in number the if the operation going to be quadratic, cubic or eny other.
        return bmi;
    }//end BMIcalculator

    public static String DefiningCategory(double mpBMI){
        final double underweight = 18.5;
        final double healthyWeight = 25;
        final double overweight = 30;

        String category = "";
        // Defining the Category
        if(mpBMI < underweight){
            category = "You are underweight!!!";
        } else if (mpBMI <= healthyWeight){
            category = "You have a healthy weight!!!";
        } else if (mpBMI <= overweight){
            category = "You are overweight!!!";
        } else{
            category = "Your are obese";
        }
        return category;

    }// End Defining Category
}
