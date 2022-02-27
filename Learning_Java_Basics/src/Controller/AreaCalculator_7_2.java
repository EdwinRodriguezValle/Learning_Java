/*
Titulo: Area Calculator;
Name: Edwin Rodriguez Valle
Goal: Build a area calculator
 */

package Controller;
//library
import  java.util.Scanner;

public class AreaCalculator_7_2 {
    public static Scanner input = new Scanner(System.in);
    public static double oppervlakteFiguur;

    public static void main (String[]args){
        int figuurKeuze;
        String figuurTekst = "";
        boolean doorgaan = true;

        while (doorgaan) {
            System.out.print("Van welke figuur wil je de oppervlakte uit laten rekenen?\n" +
                    "(cirkel = 1; rechthoek = 2; vierkant = 3; driehoek = 4; stoppen = 0): ");
            figuurKeuze = input.nextInt();
            switch (figuurKeuze) {
                case 0:
                    doorgaan = false;
                    System.out.println("\nHet programma wordt nu gestopt.");
                    break;
                case 1:
                    figuurTekst = "cirkel";
                    behandelCirkel();
                    break;
                case 2:
                    figuurTekst = "rechthoek";
                    behandelRechthoek();
                    break;
                case 3:
                    figuurTekst = "vierkant";
                    behandelVierkant();
                    break;
                case 4:
                    figuurTekst = "driehoek";
                    behandelDriehoek();
                    break;
            }
            if (doorgaan) {
                System.out.println("\nDe oppervlakte van jouw " + figuurTekst + " is " + oppervlakteFiguur + " vierkante centimeter.\n");
            }
        }
    }

    public static void behandelCirkel() {
        System.out.print("Wat is de straal in centimeter? ");
        double straal = input.nextDouble();
        oppervlakteFiguur = berekenOppervlakteCirkel(straal);
    }

    public static void behandelDriehoek() {
        System.out.print("Wat is de hoogte in centimeter? ");
        double hoogte = input.nextDouble();
        System.out.print("Wat is de basis in centimeter? ");
        double basis = input.nextDouble();
        oppervlakteFiguur = berekenOppervlakteDriehoek(basis, hoogte);
    }

    public static void behandelVierkant() {
        System.out.print("Wat is de zijde in centimeter? ");
        double zijde = input.nextDouble();
        oppervlakteFiguur = berekenOppervlakteVierkant(zijde);
    }

    public static void behandelRechthoek() {
        System.out.print("Wat is de hoogte in centimeter? ");
        double hoogte = input.nextDouble();
        System.out.print("Wat is de breedte in centimeter? ");
        double breedte = input.nextDouble();
        oppervlakteFiguur = berekenOppervlakteRechthoek(breedte, hoogte);
    }

    public static double berekenOppervlakteCirkel (double mpStraal) {
        return Math.PI * mpStraal * mpStraal;
    }

    public static double berekenOppervlakteDriehoek(double mpBasis, double mpHoogte) {
        return mpBasis * mpHoogte / 2.0;
    }

    public static double berekenOppervlakteRechthoek(double mpBreedte, double mpHoogte) {
        return mpBreedte * mpHoogte;
    }

    public static double berekenOppervlakteVierkant(double mpZijde) {
        return mpZijde * mpZijde;
    }



}
