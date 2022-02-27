/*
Title: Multiplication using while loop
Exercise:  5.1
Name: Edwin Rodriguez Valle
Goal of the exercise: The app will print a multiplication for the input number that user will provide.
*/
package Controller;
import javax.swing.*;
import java.util.Scanner;

public class LoopsMultiplication_5_1 {
    public static void main(String[] args) {
        //Variable
        Scanner input = new Scanner(System.in);
        int numberToMultiplay;
        int timesToMultiply;
        final int numberOfCifersPerLine = 5;


        //multiplay the number

        do {
            //User input
            System.out.println("Which number do you want to multiply? ");
            numberToMultiplay = input.nextInt();

            if (numberToMultiplay != 0) {
                System.out.println("How many times do you want to multiply this number?");
                timesToMultiply = input.nextInt();

                for (int i = 1; i <= timesToMultiply; i++) {
                    int product = (i * numberToMultiplay);
                    System.out.printf("%5s", product);
                    //The next loop does the followwing. If print will equal to numberOfCifersPerLine,
                    // it will stop. But if you enter pintln the next coming number until to reach the
                    // limit number container in the numberOfCifersPerLine, and will start again in a new line,
                    //until to reach the total of number to be printed.
                    if (i % numberOfCifersPerLine == 0) {
                        System.out.println();
                    }
                }
                System.out.println();
            }

        } while (numberToMultiplay != 0) ;
        System.out.println("Bye, bye!!!");
    }
}
