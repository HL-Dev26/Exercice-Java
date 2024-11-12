import java.util.Scanner;

public class EXOTEST000036
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pgrand = 0;
        int resultat = -1;

        for (int i = 1; i <= 20; i++) {
            System.out.print(" Saisir le numero: " + i +": ");
            int numero = scanner.nextInt();

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
