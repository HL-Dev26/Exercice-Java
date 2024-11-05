import java.util.Scanner;

public class EXOTEST000027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero de jour : ");
        int Jour = scanner.nextInt();
        System.out.print(" Saisir un numero de mois : ");
        int mois = scanner.nextInt();
        System.out.print(" Saisir un numero d'année : ");
        int année = scanner.nextInt();

        int[] joursparmois = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        
            if (année % 4 == 0 && (année % 100 != 0 || année % 400 == 0)) {
                joursparmois[1] = 29; 
            } 
            else {
                joursparmois[1] = 28;
            } 
            if ((mois <= 12 && mois >= 1) && (Jour >= 1 && Jour <= joursparmois[mois-1])) {
                System.out.println("Date valide"); 
            }
            else{
            System.out.println("Date invalide");
            }
            scanner.close();
    }
}