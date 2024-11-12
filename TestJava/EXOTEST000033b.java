import java.util.Scanner;

public class EXOTEST000033b
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        int numero = scanner.nextInt();
        int resultat = numero + 10;
        for (int i = numero; i < resultat; i+= 1) {
            System.out.println( i );

        }
    System.out.println(" Yes, you did it ! ");
        scanner.close(); 
    }
}
