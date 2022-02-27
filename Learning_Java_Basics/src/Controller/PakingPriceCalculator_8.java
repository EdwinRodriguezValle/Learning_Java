/*
Titulo: Parking price calculator;
Name: Edwin Rodriguez Valle
Goal: Build an app to calculated the price total price for one day for the entire parking and per car.
 */

package Controller;
import java.util.Scanner;

public class PakingPriceCalculator_8 {
    final static int MAX_AANTAL_UREN = 24;
    final static int UREN_BASIS_TARIEF = 3;
    final static double BASIS_TARIEF = 3.75;
    final static double GEWOON_TARIEF = 2.75;
    final static double DAGKAART_TARIEF = 25.0;

    public static void main(String[] args) {

        // Stap 1: vraag om het aantal auto's.
        Scanner inputVrager = new Scanner(System.in);
        System.out.print("Hoeveel auto's hebben geparkeerd? ");
        int aantalAutos = inputVrager.nextInt();
        // Stap 2: Initialiseer drie arrays voor kentekens, parkeerduur, parkeerkosten.
        String[] kentekens = new String[aantalAutos];
        int[] parkeerduur = new int[aantalAutos];
        double[] parkeerkosten = new double[aantalAutos];
//        double totaleKosten;
        // Stap 3: Vraag per auto om het kenteken en de parkeerduur.
        for (int arrayTeller = 0; arrayTeller < aantalAutos; arrayTeller++) {
            System.out.println("Auto " + (arrayTeller + 1));
            System.out.print("\tKenteken: ");
            kentekens[arrayTeller] = inputVrager.next();
            do {
                System.out.printf("\tGeparkeerde uren (max. %d): ", MAX_AANTAL_UREN);
                parkeerduur[arrayTeller] = inputVrager.nextInt();
                // Controleer op de correcte invoer, de duur is maximaal 24 uur.
                if (parkeerduur[arrayTeller] > MAX_AANTAL_UREN) {
                    System.out.printf("\tDe parkeerduur kan maximaal %d uur zijn.\n", MAX_AANTAL_UREN);
                }
            }
            while (parkeerduur[arrayTeller] > MAX_AANTAL_UREN);
//            parkeerkosten[arrayTeller] = berekenParkeergeld(parkeerduur[arrayTeller]);
        }
        // Stap 4: gebruik de aparte methode om de parkeerkosten per auto te berekenen en op te slaan in de derde array.
        for (int arrayTeller = 0; arrayTeller < aantalAutos; arrayTeller++) {
            parkeerkosten[arrayTeller] = berekenParkeergeld(parkeerduur[arrayTeller]);
        }
        // Stap 5: Druk het overzicht af per auto.
        System.out.println("Parkeeroverzicht");
        System.out.printf("%8s%8s%10s\n", "kenteken", "uren", "bedrag");
        for (int arrayTeller = 0; arrayTeller < aantalAutos; arrayTeller++) {
            System.out.printf("%8s%8d%10.2f\n", kentekens[arrayTeller], parkeerduur[arrayTeller],
                    parkeerkosten[arrayTeller]);
        }
        System.out.println();
        // Stap 6: gebruik de aparte methode om de totale parkeerkosten te berekenen.
        double totaleKosten = berekenTotaleParkeerkosten(parkeerkosten);
        // Stap 7: Druk het totaal af.
        System.out.println("Totaal van alle parkeergelden: " + totaleKosten + " euro.");
    } // van main

    // Methode om de parkeergelden per auto te berekenen op basis van de parkeerduur.
    public static double berekenParkeergeld(int mpParkeerduur) {
        double result;
        if (mpParkeerduur <= UREN_BASIS_TARIEF) {
            result = mpParkeerduur * BASIS_TARIEF;
        } else {
            result = UREN_BASIS_TARIEF * BASIS_TARIEF + (mpParkeerduur - UREN_BASIS_TARIEF) * GEWOON_TARIEF;
        }
        if (result > DAGKAART_TARIEF) {
            result = DAGKAART_TARIEF;
        }
        return result;
    } // berekenParkeergeld

    // Methode om het totaal van de parkeerkosten te berekenen.
    public static double berekenTotaleParkeerkosten(double[] mpParkeerkosten) {
        double som = 0.0;
        for (int arrayTeller = 0; arrayTeller < mpParkeerkosten.length; arrayTeller++) {
            som += mpParkeerkosten[arrayTeller];
        }
        return som;
    }


}
