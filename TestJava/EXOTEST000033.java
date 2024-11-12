import java.util.Scanner;

public class EXOTEST000033
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        int numero = scanner.nextInt();
        int resultat = numero + 10;
        while (numero < resultat ) {
            //numero = numero + 1;
            //numero += 1;
            numero++;
            System.out.println( numero );
           
        }
    System.out.println(" Yes, you did it ! ");
        scanner.close(); 
    }
}
