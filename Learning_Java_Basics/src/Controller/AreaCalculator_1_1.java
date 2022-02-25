/*
Title: Area Calculator
Exercise:  1.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Area calculator
*/

package Controller;

public class AreaCalculator_1_1 {
    public static void main(String[] args) {
        // Variable definition to calculate the area of the circular.
        int radio = 2;

        // This de formula for ara: (A = π r²)

        double area = (3.14 * radio * radio);
        System.out.println("The area of your square is: " + area);

        // Calculate square area height * 2

        double height = 3.5;

        double squareArea = (height * 2);

        System.out.println("Your square is: " + squareArea);

        // Calculate area of triangle a = (height * base / 2)

        int heightTriangle  = 3;
        int base = 3;

        double areaTringle = ((heightTriangle * base)/2.0);
        System.out.println("Your triangle area is: " + areaTringle);

    }
}
