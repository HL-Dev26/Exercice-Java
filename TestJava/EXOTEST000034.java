import java.util.Scanner;

public class EXOTEST000034
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        int numero = scanner.nextInt();
        int resultat = 0;
        for (int i = 1; i <= numero; i++) {
            resultat += i;
          
        }
    System.out.println("La somme des nombres jusque " + numero + " est: " + resultat);
        scanner.close(); 
    }
}
