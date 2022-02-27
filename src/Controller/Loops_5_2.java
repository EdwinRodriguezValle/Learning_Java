/*
Title: Writing methods using loops
Exercise:  5.2
Name: Edwin Rodriguez Valle
Goal of the exercise: Build different method using loops .
*/
package Controller;
//library
import java.util.Scanner;

public class Loops_5_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Print a line of starts
        StartLine(5);
        System.out.println();
        System.out.println();

        //Print a block os start with using the input of the first methods
        StartBlock(4);

        //Print a character that the user wants.
        System.out.println();
        System.out.println("Welke character do you want printing? ");
        char character = input.next().charAt(0);
        System.out.println();
        System.out.println("How many times do you want to print this character? ");
        int timesToPrint = input.nextInt();
        //Calling the method
        System.out.println();
        PrintACharacter(character, timesToPrint);

        //Count till 1000
        System.out.println();
        System.out.println("Adding till 1000 using a while loop:");
        AddUpToThousandAllInters();
        System.out.println();
        System.out.println("Till how much do you have to count? ");
        int limit = input.nextInt();
        System.out.printf("The first %d number added is almost %d",
                countTheTotalCiferToAdd(limit), limit);

    }//main

    //----------------------------------------------------------------------------------------------------//
// Este metodo primero imprime la entrada que le des. Si le pides 4 veces, imprimir cuatro veces el caracter
    //que has definido. Eso es la salido.
    public static void StartLine(int mpStart){
        for (int i = 0; i < mpStart; i++) {
            System.out.print("* ");
        }
    }
    //En caso que usas un metodo como argumento o bloque de ejecución, lo que hace java es: Primero va ejecutar el primer
    //metodo con la cantidad de imput que le has adado, luego el segundo método, va ejecutar la salida del metodo que llamas.
    // En este caso  estar in StartLine (con la cantidad que le pides, luego ejecuta se ejecuta con esta salida StartBlock.
    //Por eso se hace una función cuadratica o recurrente. El segundo solo repruduce más las veces que li dices el la salida del primer metodo.
    public static void StartBlock(int mpBlockStart){
        for (int i = 0; i < mpBlockStart; i++) {
            StartLine(mpBlockStart);
            System.out.println();
        }
    }
    public static void PrintACharacter(char mpCharacter, int mpTimesToPrint){
        for (int i = 0; i < mpTimesToPrint; i++) {
            System.out.print(mpCharacter);
        }
        System.out.println();
    }
    public static void AddUpToThousandAllInters(){
        int fisrtNumber = 1;
        int totalSum = 0;
        while(totalSum < 1000){
            totalSum += 1000;
            fisrtNumber++;
        }
        System.out.println(totalSum);
        System.out.println(fisrtNumber - 1);
    }

    public static int countTheTotalCiferToAdd(int mpLimit){
        int number = 0;
        int sum =0;
        while(sum < mpLimit){
            number++;
            sum+= number;
        }
        return number - 1;
    }

}
