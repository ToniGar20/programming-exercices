/**
 * 6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
 * Si no lo es, también debemos indicarlo.
 */

package BasicExercices1;

import java.util.Scanner;

public class Exercice6 {

    public static void main(String[] args) {

        System.out.println("Introduce un número");
        Scanner scanner = new Scanner(System.in);
        int yourNumber = scanner.nextInt();

        if (yourNumber%2 == 0) {
            System.out.println("Tu número SE PUEDE dividir entre dos");
        } else {
            System.out.println("Tu número NO SE PUEDE dividir entre dos");
        }


    }
}

