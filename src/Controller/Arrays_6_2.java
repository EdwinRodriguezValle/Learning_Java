// Use of Arrays
// Edwin Rodríguez Valle
// Goal: Exercises with arrays


package Controller;
//Library
import java.util.Scanner;

public class Arrays_6_2 {
    public static void main(String[] args) {
        //Variable
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("How many numbers do you want generate? ");
        int numberCifers = input.nextInt();
        System.out.println("what in the highest number do you want to get? ");
        int maximunNumber = input.nextInt();

        int[] array = LineRandomNumber(numberCifers, maximunNumber);
        System.out.print("This are the number generated:");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.print(array[counter] + " ");
        }

        // printing a sum
        System.out.println();
        System.out.println("The sum of your array is: " + sumOfAnArray(array));

        //Printing average
        System.out.println();
        System.out.println("The average is: " + AverageArray(array));

        //Minimum of an array
        System.out.println("The minimum of is: " + minimumOfanArray(array));

        //Printing the repeat number
        int[] array2 = LineRandomNumber(1000, 50);
        System.out.println("El 23 se repite: " + VecesQueSeRepiteUnNumero(array2, 23) + ".");

        //Número de ocurrencias
        int[] cantidaddeOcurrencias = NumeroDeOcurrencias(array, 50);

        System.out.println("Ocurrencias de un numero en un array");
        for (int ocurrencias = 0; ocurrencias < cantidaddeOcurrencias.length;
             ocurrencias++) {
            System.out.println("Numero" +
                    (ocurrencias + 1) + cantidaddeOcurrencias[ocurrencias]);

        }


    }// main

    public static int[] LineRandomNumber(int mpNumber, int mpMaximun){
        int[] resultLine = new int[mpNumber];
        for (int i = 0; i < mpNumber; i++) {
            resultLine[i] = RamdomNumber(mpMaximun);
        }
        return resultLine;
    }

    public static int RamdomNumber(int mpMaximun){
        return (int) (Math.random() * mpMaximun ) + 1;
    }
    public static int sumOfAnArray(int[] mpArray){
        int sum = 0;
        for (int i = 0; i < mpArray.length; i++) {
            sum += mpArray[i];
        }
        return sum;
    }

    public static double AverageArray(int[]mpArray){
        int sum = sumOfAnArray(mpArray);
        return (double) sum / mpArray.length;
    }

    public static int minimumOfanArray(int[] mpArray){
        int minimun = mpArray[0];
        for (int arrayCounter = 1; arrayCounter < mpArray.length; arrayCounter++) {
            if(mpArray[arrayCounter] < minimun){
                minimun = mpArray[arrayCounter];
            }
        }
        return minimun;
    }

    public static int VecesQueSeRepiteUnNumero(int[] mpArray, int mpNumber){
        int teller = 0;
        for (int arrayTeller = 0; arrayTeller < mpArray.length; arrayTeller++) {
            if(mpArray[arrayTeller] ==  mpNumber){
                teller++;
            }
        }
        return teller;
    }

    public static int[] NumeroDeOcurrencias(int[] mpArray, int mpLimite){
        int[] numeroDeOcurrencias = new int[mpLimite];
        for (int i = 0; i < mpLimite; i++) {
            numeroDeOcurrencias[i] = VecesQueSeRepiteUnNumero(mpArray,
                    i + 1);

        }
        return numeroDeOcurrencias;
    }







}
