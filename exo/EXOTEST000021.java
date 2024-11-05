
import java.util.Scanner;

public class EXOTEST000021 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" Saisir un nombre entier : ");
        int nombre = scanner.nextInt();

        if (nombre >= 0) {
            System.out.println(" Le nombre est positif.");

        } else {
            System.out.println(" Le nombre est négatif.");
        }
            scanner.close();

        System.out.println();
    }

}
