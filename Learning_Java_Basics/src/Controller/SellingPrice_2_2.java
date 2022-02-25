/*
Title: Selling price
Exercise:  2.2
Name: Edwin Rodriguez Valle
Goal of the exercise: Calculate the selling price of a product. It will calculate base on the buying price.
*/
package Controller;
// library
import java.util.Scanner;

public class SellingPrice_2_2 {
    public static void main(String[] args) {
        //variables to save data
        Scanner input = new Scanner(System.in);
        double buyingPrice;
        double profitMargen;
        double sellingPrice;
        int taxCategory;
        double sellingPriceInTaxes;
        final double lowTax = 18;
        final double highTax = 25;


        //Asking input from the user
        System.out.println("We going to calculate the price of your product to sell.");

        System.out.println("Please, type the buying price of your product?");
        buyingPrice = input.nextDouble();

        System.out.println("Please, type the your profit margin (in %)?");
        profitMargen = input.nextDouble();


        //Calculating selling price(Selling price - Buying price / buying price * 100)

        sellingPrice = buyingPrice + buyingPrice * (profitMargen/100);
        System.out.println("Your selling price exclusive taxes is: " + sellingPrice +".");

        //Asking tax category to which the user belongs
        System.out.println("In which tax scale do you fall? \n \t 1 = High 18% \n \t 2 = Low 25% ");
        taxCategory = input.nextInt();

        //Calculating the selling price inclusive taxes.
        switch (taxCategory){
            case 1:
                sellingPriceInTaxes = sellingPrice + sellingPrice *
                        (lowTax/100.0);
                System.out.println("Your selling price inclusive low tax "
                        + lowTax + "% is:" + sellingPrice);
                break;

            case 2:
                sellingPriceInTaxes = sellingPrice + sellingPrice *
                        (highTax/100.0);
                System.out.println("Your selling price inclusive high tax "
                        + highTax + "% is:" + sellingPrice);
                break;
            default:
                System.out.println("You have introduce an wring value!!");



        }


    }
}
