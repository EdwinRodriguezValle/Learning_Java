/*
Title: Average calculator
Exercise:  4.2
Name: Edwin Rodriguez Valle
Goal of the exercise: Build an application that calculate the average of two o more numbers provided by the user.
*/
package Controller;
//Library
import java.util.Scanner;

public class LoopsAverageCalculator_4_2 {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int nextNumber;
        int totalSumOfValues;
        int numberOfValues;
        double average;
        String continueAnswer;
        boolean forward = true;

        //Printing first message
        System.out.println("THIS PROGRAM CALCULATE THE AVERAGE OF TWO O MORE NUMBERS.");
        System.out.println();
        System.out.println("Do you want to use this program? \n Yes, to continue.\n No, to stop.");
        continueAnswer = input.next();
        if (continueAnswer.equals("No")) {
            forward = false;
            System.out.println("This program will stop!!!\n Have a nice day!!!");
        }// end if
        while (forward) {
            System.out.println("Please, enter your first number: ");
            firstNumber = input.nextInt();
            System.out.println("Please, enter your second number: ");
            secondNumber = input.nextInt();
            //Calculating sum of values and number o values.
            totalSumOfValues = firstNumber + secondNumber;
            numberOfValues = 2;

            // Asking user to type a third number.
            System.out.println("Do you want to enter a third number? \n Yes, to continue. \n No, to stop. ");
            continueAnswer = input.next();

            //
            if (continueAnswer.equals("No")) {
                average = firstNumber + secondNumber / 2.0;
                System.out.println("The average of your number is: " + average + ". \n Thanks for using this app!!!");
            }//End if
            System.out.println("Please type the third number:");
            nextNumber = input.nextInt();
            average = AverageNumberThird(firstNumber, secondNumber, nextNumber);
            System.out.println("The average of your numbers is " + average + ".");
            // Asking if the user want to continue
            System.out.println("Do you want to continue? \n Yes, to continue. \n No, to stop. ");
            continueAnswer = input.next();
            if(continueAnswer.equals("No")){
                forward = false;

            }//end if
            System.out.println("This program will stop. \n THANKS FOR USING OUR SERVICES!!!");

        }// end while


    }// end main

    public static double AverageNumberThird(double mpFirstNumber, double mpSecondNumber, double mpNextNumber) {
        double average = mpFirstNumber + mpSecondNumber + mpNextNumber / 3.0;
        return average;
    }
}
