import java.util.Scanner;

public class EXOTEST000035
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        long numero = scanner.nextInt();
        long resultat = 1;
        for (int i = 1; i <= numero; i++) {
            resultat *= i;
          
        }
    System.out.println("La factorielle de " + numero + " est: " + resultat);
        scanner.close(); 
    }
}
