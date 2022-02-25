/*
Title: Average calculator with answer control using while loop
Exercise:  4.2.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Build an application that calculate the
average of two o more numbers provided by the user and controlling the input.
*/
package Controller;
//Library
import java.util.Scanner;

public class LoopsAverageCalculatorWithcontrol_4_1_2 {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        int firtNumber;
        int secondNumber;
        int nextNumber;
        int sumOfTotalValue;
        int numberOfValues;
        String yesGoON;
        boolean goON = true;
        double average;
        //Asking input of the user
        System.out.println("This program will calculate the average of one or more numbers: " +
                "\n Please type your first numbers:" );
        firtNumber = input.nextInt();
        System.out.println("Please, type your second number? ");
        secondNumber = input.nextInt();

        //Calculating the sum of value en the number of values.
        sumOfTotalValue = firtNumber + secondNumber;
        numberOfValues = 2;
        double averageOne = sumOfTotalValue/ numberOfValues;

        //Implementing the use of loop while to ask more input and let keep going on the program.
        while(goON){
            System.out.println("Do you want to enter more numbers? \n Yes, to continue. \n No, to stop.");
            yesGoON = input.next();

            //Controlling the inout if it matches with the requiered values.
            while(!yesGoON.equals("Yes") && !yesGoON.equals("No")){
                System.out.println("Please enter the right value as we show on the screen: \n Yes, to continue. \n No, to stop.");
                yesGoON = input.next();
            }//Second while loop.
            if(yesGoON.equals("No")){
                //Stop program execution.
                goON = false;
            }else{
                System.out.println("Type your next number: ");
                nextNumber = input.nextInt();
                sumOfTotalValue +=  nextNumber;
                numberOfValues++;
            }

            average = (double) sumOfTotalValue/numberOfValues;
            System.out.println("The average of your number is " + average + ".");
            System.out.println("Thank for using our app!!!");
        }//First while.
        //Calculating the output and printing out.


    }
}
