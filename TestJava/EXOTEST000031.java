import java.util.Scanner;

public class EXOTEST000031 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;

        System.out.print(" Rentrer un nombre compris entre 1 et 3 : ");


        while (nombre < 1 || nombre > 3) {
        nombre = scanner.nextInt();
        
        if (nombre < 1 || nombre > 3) {
        System.out.println(" Erreur " );
            
        }          
    }
    System.out.println(" Bravo, vous avez réussi ! ");
        scanner.close(); 
    }
}