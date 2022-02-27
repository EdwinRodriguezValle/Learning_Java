/*
Title: Methods
Exercise:  3_3
Name: Edwin Rodriguez Valle
Goal of the exercise: Building and callind different methods
*/
package Controller;
// library
import java.util.Scanner;

public class Methods_3_3 {
    public static void main(String[] args) {
        // variables
        Scanner input = new Scanner(System.in);
        //Print four times a start using a method.
        System.out.println("Printing four times stars just for fun!!!");
        PrintStarts();//Defining in the methods what it is going to do,
        // Here I just call the method. It is just fixed to some specific defined in the method.

        // Print five times a word with the help of a method.
        System.out.println("Here we going to print five time a word. ");
        System.out.println();
        System.out.println("Which word do you want to print for times? ");
        String word = input.next();
        PrintFiveTimes(word);
        System.out.println();

        //Dividing coins between people
        System.out.println("Making a fair division of coins. ");
        System.out.println();
        System.out.println("How much do you want to divided?");
        int coinsToBeDivided = input.nextInt();
        System.out.println("How many people are you? ");
        int people = input.nextInt();
        //Colling method
        DividingCoins(coinsToBeDivided, people);
        System.out.println();

        // Colling a method to see the remainder between the available budget and the amount paid
        System.out.println("Calculating the reminder of an budget after have been paid all the poeple. ");
        System.out.println();
        System.out.println("How much do you need to pay still? ");
        double toPay = input.nextDouble();
        System.out.println("How much have you already paid? ");
        double paid = input.nextDouble();
        //Colling the method
        System.out.println("Your reminder budget is: " + RemianderMoney(toPay, paid));
        System.out.println();

        // calculating the difference after paying with big bill
        System.out.println("We going to calculate the change money. ");
        System.out.println();
        System.out.println("How much did you paid with cash? ");
        double AlreadyPaid = input.nextDouble();
        System.out.println("How much you have to paid for your shops? ");
        double TobePay = input.nextDouble();

        // printing the difference rounded to 5.
        double amountOfMoneyToGetBack = ChangeMoney(AlreadyPaid, TobePay);

        System.out.println("You will get back " + amountOfMoneyToGetBack + " Thanks!!!");




    }// main

    public static void PrintStarts(){
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
        System.out.println("* * * *");
    }// PrintStarts.

    public static void PrintFiveTimes(String mpWord){
        System.out.println("\t" + mpWord + "\n \t" + mpWord + "\n \t" + mpWord + "\n \t" + mpWord + "\n \t" + mpWord );
    };

    public static void DividingCoins(int mpCoin, int mpPeople){
        int coinsPerPerson = mpCoin/mpPeople;
        int reminder = mpCoin % mpPeople;
        System.out.println("If you divided " + mpCoin + " coins between " +
                mpPeople + " people, \n Each people will get " + coinsPerPerson + " coins. \n The remained " +
                reminder + ", will be donated for the pours. ");
    }
    public static double RemianderMoney(double mpPay, double mpPaid){
        double remiander = mpPay - mpPaid;
        return remiander;
    }

    public static double ChangeMoney(double mpPaid, double mpToPay){
        double difference = mpPaid - mpToPay;
        return (Math.round(difference * 20)/ 20.0);
    }

}
