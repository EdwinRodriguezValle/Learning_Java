/*
Title: Dice lunching
Exercise: 5.3
Name: Edwin Rodriguez Valle
Goal of the exercise: Dice lunching using chracter
*/

package Controller;
//Library
import java.util.Scanner;

public class Probability_5_3 {
    public static void main(String[] args) {
        System.out.println("Qué caracter debo usar para el más alto? ");
        //Entrada
        Scanner input = new Scanner(System.in);
        String inputS = input.next();
        char carater = inputS.charAt(0);
        int lanzar;

        //Correr el loop hasta que el seis sea lanzado.
        do{
            lanzar = Lanzamientos();
            ImprimirEldado(lanzar, carater);
        } while (lanzar!=6);

    }// main

    //Método para buscar un numero random.
    public static int Lanzamientos(){
        return(int)(Math.random()*6) + 1;
    }

    public static void ImprimirEldado(int mpLanzar, char mpCaracter){
        //Hacer seis constantes donde puedan caer los caracteres.

        //Imprimir el dado, el metado más facil
        final String lanzamiento01 = "\n %c \n";
        final String lanzamiento02 = "%c \n\n %c\n";
        final String lanzamiento03 = "%c \n %c\n  %c\n";
        final String lanzamiento04 = "%c %c\n\n%c %c\n";
        final String lanzamiento05 = "%c %c\n %c \n%c %c\n";
        final String lanzamiento06 = "%c %c\n%c %c\n%c %c\n";

        //
        switch (mpLanzar){
            case 1:
                System.out.printf(lanzamiento01, mpCaracter);
                break;
            case 2:
                System.out.printf(lanzamiento02, mpCaracter);
            case 3:
                System.out.printf(lanzamiento03, mpCaracter);
            case 4:
                System.out.printf(lanzamiento04, mpCaracter);
            case 5:
                System.out.printf(lanzamiento05, mpCaracter);
            case 6:
                System.out.printf(lanzamiento06, mpCaracter);
        }

    }
/*public static void main(String[] args) {
        // vraag om invoer voor het te gebruiken karakter
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        // lees alleen eerste karakter uit de invoer
        // optie is om de delimiter van Scanner op "" in te stellen met useDelimiter("");
        Scanner invoer = new Scanner(System.in);
        String invoerStr = invoer.nextLine();
        char karakter = invoerStr.charAt(0); // mag ook met nextLine, let er dan wel op de in de printf de %s gebruikt wordt

        int worp;
        // loop totdat 6 wordt gegooid
        do{ // do anders komt er een tweede Math.random buiten de loop, moet tenminste 1 keer gedaan worden
        worp = werpDobbelsteen();
        toonDobbelsteen(worp, karakter);
        } while (worp != 6);
        }

public static int werpDobbelsteen() {
        return (int) (Math.random()* 6) + 1;
        }

public static void toonDobbelsteen(int mpWorp, char mpCharacter) {
// optie om 6 constanten te maken waarbij je het karakter vervangt
// feitelijk de makkelijkste methode
final String worp01 = "\n %c \n";
final String worp02 = "%c \n\n  %c\n";
final String worp03 = "%c \n %c\n  %c\n";
final String worp04 = "%c %c\n\n%c %c\n";
final String worp05 = "%c %c\n %c \n%c %c\n";
final String worp06 = "%c %c\n%c %c\n%c %c\n";
        // print ASCII tekening, let op 2 'ogen' per regel, totaal 3 regels
        // kan ook met if, else if
        // hoeft niet met constanten
        switch(mpWorp){
        case 1: System.out.printf(worp01, mpCharacter); break;
        case 2: System.out.printf(worp02, mpCharacter, mpCharacter); break; //
        case 3: System.out.printf(worp03, mpCharacter, mpCharacter, mpCharacter); break;
        case 4: System.out.printf(worp04, mpCharacter, mpCharacter, mpCharacter, mpCharacter); break;
        case 5: System.out.printf(worp05, mpCharacter, mpCharacter, mpCharacter, mpCharacter, mpCharacter); break;
        case 6: System.out.printf(worp06, mpCharacter, mpCharacter, mpCharacter, mpCharacter, mpCharacter, mpCharacter); break;
        }
        }*/

}
