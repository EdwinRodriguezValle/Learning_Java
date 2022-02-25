/*
Title: Exam scores
Exercise: 6.1
Name: Edwin Rodriguez Valle
Goal of the exercise: Write an application to help professors managing the students scores
*/
package Controller;
//library
import java.util.Scanner;

public class ExamsScores_6_1 {
    public static void main(String[] args) {
        //Variables
        Scanner input = new Scanner(System.in);
        double[] scores;
        int numberScores;
        double[] averageScores;
        int[] numberOfGoodScores;
        final int MINUMUN_NUMBER = 0;

        //Asking input
        System.out.println("\t How many scores do you want to fill in? " +
                "\n \t The number of scores must be more than zero.");
        //Validation to guaranty that scores must be at least one number
        do {
            numberScores = input.nextInt();
            if (numberScores <= MINUMUN_NUMBER) {
                System.out.println("\tThe numbers of scores must be more than zero?");
                System.out.println("\tHow many scores do you want to fill in? ");
            }
        } while (numberScores <= MINUMUN_NUMBER);

        //Generating the array to save data
        scores = new double[numberScores];

        //Entering scores / data
        for (int index = 0; index < scores.length; index++) {
            System.out.printf("Student Scores %d: ", (index + 1));
            scores[index] = input.nextDouble();
        }
        System.out.printf("\n numberScores %d: \n", numberScores);

        //Calling the method of the highest score
        double highestScore = definingTheHighgestScore(scores);
        System.out.printf("The highest score : %.1f \n", highestScore);

        //Calling the method to print the number of approved
        int numberOfApproved = ApprovedScore(scores);
        System.out.printf("The number of approved: %d \n", numberOfApproved);

        //Calling the average method and print the output
        double average = AverageScore(scores);
        System.out.printf("The average of scores is : %.1f \n", average);


    }//main

    //Defining the highest score

    public static double definingTheHighgestScore(double[] mpScore) {
        //Highgest scores
        double highestScore = mpScore[0];
        for (int index = 0; index < mpScore.length; index++) {
            if (mpScore[index] > highestScore) {
                highestScore = mpScore[index];
            }
        }
        return highestScore;
    }
    //Defining the number of score approved. Giving a range between 0 till 10: above 5 in approved
    public static int ApprovedScore(double[] mpScores){
        final double APPROVED = 5.5;
        int numberApproved = 0;
        for (int index = 0; index < mpScores.length ; index++) {
            if(mpScores[index] >= APPROVED){
                numberApproved++;
            }
        }
        return numberApproved;
    }

    //Difining the average score
    public static double AverageScore(double[] mpScore){
        double total = 0;
        for (int i = 0; i < mpScore.length; i++) {
            total = total + mpScore[i];
        }
        return total/mpScore.length;
    }
}
