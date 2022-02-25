/*
Title: Age calculator
Exercise:  1.2
Name: Edwin Rodriguez Valle
Goal of the exercise: Print for the very first time the Christmas tree
*/

package Controller;
//library
import java.util.Scanner;

public class AgeCalculator_1_2 {
    public static void main(String[] args) {
        //Variables definition
        Scanner input = new Scanner(System.in);
        final int currentYear = 2022;

        //User input
        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("In which year have you been born? ");

        int dateOfBirth = input.nextInt();

        System.out.println();

        int age = currentYear - dateOfBirth;

        System.out.println("Dear " + name + " your age is " + age + " years old." );
        System.out.println();
        System.out.println("Have a nice day " + name + "!!!");


    } // end main.
}
