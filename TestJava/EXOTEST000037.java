import java.util.Scanner;

public class EXOTEST000037
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pgrand = 0;
        int resultat = -1;

        for (int i = 1; i > 0; i++) {
            System.out.print(" Saisir le numero (ou 0 pour arreter): " + i +": ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                break;
            }
            if (numero > pgrand ) {
                pgrand = numero;
                resultat = i;
            }
        }
        System.out.println("Résultat :");
        System.out.println("Le plus grand des nombres saisis est : " + pgrand + ".");
        System.out.println(pgrand + " était le nombre numéro " + resultat + ".");
        scanner.close(); 
    }
}
