import java.util.Scanner;

public class EXOTEST000024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir heure : ");
        int heure = scanner.nextInt();
        System.out.print("Saisir minute : ");
        int minute = scanner.nextInt();
        if (heure < 0 || heure > 23 || minute < 0 || minute > 59) {
            System.out.println(" Les données saisies sont invalides ");
        } else {
            minute = minute + 3;

            if (minute > 59) {
                heure = heure + 1;
                minute = minute - 60;
                // heure += 1;
                if (heure > 23) {
                    heure = 0;
                }

            }
            System.out.println("Dans 3 minutes il sera : " + heure + "h" + minute);
        }
        scanner.close();
    }
}