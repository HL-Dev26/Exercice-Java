import java.util.Scanner;

public class EXOTEST000035b
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        long numero = scanner.nextInt();
        long resultat = 1;
        String calcul = "La factorielle de " + numero + ", notée " + numero + "!, vaut "; 

        for (int i = 1; i <= numero; i++) {
            resultat *= i;
            if (i < numero) {
                calcul += i + " x ";
            } else {
                calcul += i;
            }
        }
    System.out.println(calcul + " = " + resultat);
        scanner.close(); 
    }
}
