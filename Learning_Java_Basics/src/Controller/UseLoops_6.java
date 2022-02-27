// Use of loops
// Edwin Rodríguez Valle
// Exercising with loops


package Controller;

public class UseLoops_6 {
    public static void main(String[] args) {
        //While loop. It repeats the loop until the condition meet false. It kan keep going on without stop.
        System.out.println();
        System.out.println("While loop. It repeats the loop until the condition meet false. It kan keep going on without stop.");
        int teller = 0;
        while(teller < 4) {
            System.out.println("I love you");
            teller++;
        }
        // do while loop. It repeats at last once the loop.
        System.out.println();
        System.out.println("do while loop. It repeats at last once the loop.");
        int counter = 0;
        do{
            System.out.println("My heart is for you!!!");
            counter ++;
        } while (counter < 5);

        System.out.println();
        /// For loop will repeat the loop until the condition will meet.

        System.out.println("For loop will repeat the loop until the condition will meet.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Te amo!!!");

        }

        //Wanner elke loop
        //You use if, if you know how many times do you need to repeat the loop.
        System.out.println();
        System.out.println("You use if, if you know how many times do you need to repeat the loop");
        int number = 5;
        if (number < 5) {
            System.out.println("Believe me, I love you!!!");
        }


        // if, break. We use break to stop the action
        System.out.println();
        System.out.println("if, break. We use break to stop the action");
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
            if (j == 4) {
                break; // It indicates to stop.
            }
        }

        //loop and continue. It indicates the loop to continue if it meets the conditions.
        System.out.println();
        System.out.println("loop and continue. It indicates the loop to continue if it meets the conditions");
        int contador = 0;
        while (contador < 10) {
            if (contador == 4) {
                contador ++;
                continue;
            }
            System.out.println(j);
            contador ++;
        }

    }//main
}
