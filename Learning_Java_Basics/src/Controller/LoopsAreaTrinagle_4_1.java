/*
Title: Area calculator
Exercise:  4.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Build an application for student to practice their skills calculating the area of a triangle.
*/
package Controller;
//library
import java.util.Scanner;

public class LoopsAreaTrinagle_4_1 {
    public static void main(String[] args) {
        //Variable definition
        Scanner input = new Scanner(System.in);
        String yesContinue;
        boolean forward = true;
        int height;
        int base;
        double areaTriangle;
        double areaTriangleStudent;

        //Asking student if they want to practice.
        System.out.println("Do you want to use this app? \n \t " +
                "To continue type y, \n \t To exit type n,");
        yesContinue = input.next();
        if(yesContinue.equals("n")){
            forward = false;
        }
        while(forward){
            height = (int) (9 * Math.random() + 2);
            base = (int) (9 * Math.random() + 2);
            areaTriangle = TriangleAreaFormula(height, base);
            System.out.println("Calculate the area of a triangle with:\n\t Height: " + height + ", \n\t Base: " +base +",");
            System.out.println("Please, enter here your response? ");
            areaTriangleStudent = input.nextDouble();


            //comparing responses
            if (areaTriangle ==  areaTriangleStudent){
                System.out.println("Your answer is correct!!!");
            } else{
                System.out.println("Your answer in not correct. \n The correct answer is " + areaTriangle);
            }

            System.out.println("Do you want to continue? \n\t To continue type y, \n\t To stop type n");
            yesContinue = input.next();
            if(yesContinue.equals("n") ){
                forward = false;

            }

        }
        System.out.println("This app will stop, \n THANKS FOR USING OUR APP!!!");

    }//end main

    public static double TriangleAreaFormula( int mpHeight, int mpBase){
        return mpBase * mpHeight / 2.0;
    }// AreaFormula

}
