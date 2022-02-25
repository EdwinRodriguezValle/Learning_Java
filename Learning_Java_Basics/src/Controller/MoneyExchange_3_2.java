/*
Title: Money Exchange
Exercise:  3.2
Name: Edwin Rodriguez Valle
Goal of the exercise: Calculate the money exchange from euro  to dollar, yen,etc
*/
package Controller;
//library
import java.util.Scanner;

public class MoneyExchange_3_2 {
    public static void main(String[] args) {
        // Variables
        final double dollar = 1.23843;
        final double pound = 0.88459;
        final double yen = 134.64711;
        Scanner input = new Scanner(System.in);
        double amountToExchangeEuros;


        //User imputs
        System.out.println("How much do you want exchange in euros? ");
        amountToExchangeEuros = input.nextDouble();
        System.out.println();
        System.out.println( "We charge for each transference: \n \t Minimum = 2 Euros." +
                " \n \t Standard fee 1.5% * amount. \n \t Max = 15 Euros.");
        // Print the output
        System.out.println();
        double rateToCharge = TransfereCostCalculation(amountToExchangeEuros);
        System.out.println("We charge you " + rateToCharge + ".");

        // Calculating money exchange
        double moneyExchangeFreeFee = amountToExchangeEuros - rateToCharge;
        System.out.println();
        double exchangeToDollar = moneyExchangeFreeFee * dollar;
        System.out.println("You will receive the following amount according to your preferences: ");
        System.out.println("You receive " + exchangeToDollar + " dollars.");
        double exchangePound = moneyExchangeFreeFee * pound;
        System.out.println("You receive " + exchangePound + " pounds.");
        double exchangeYen = moneyExchangeFreeFee * yen;
        System.out.println("You receive " + exchangeYen + " yens");

        System.out.println("Thanks a lot for using our services!!!");

    }//end main

    public static double TransfereCostCalculation(double mpEuros){
        final int minimunTransferenceCost = 2; //(Per transaction)
        final double maxTransferenceCost = 15;//(euros)
        double fee = 1.5;// (% of the amount transfer)

        double aplicableFeeSelection = fee * mpEuros/100.00;
        if(aplicableFeeSelection < minimunTransferenceCost){
            aplicableFeeSelection = minimunTransferenceCost;

        }else if(aplicableFeeSelection > maxTransferenceCost){
            aplicableFeeSelection = maxTransferenceCost;
        } else {
            aplicableFeeSelection = mpEuros * 15 / 100.00;
        } return Math.round(aplicableFeeSelection);

    }//end TransferenceCost

    public static double MoneyExchange(double mpMoneyExchange, double mpMoneyExchangeFreeFee) {
        double exchange = mpMoneyExchange * mpMoneyExchangeFreeFee;
        return exchange;
    }
}
