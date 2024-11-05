import java.util.Scanner;

public class EXOTEST000029 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Rentrer un âge : ");
        int age = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'année de permis : ");
        int anpermis = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'accident : ");
        int accident = scanner.nextInt();
        System.out.print(" Rentrer un nombre d'année d'assurance : ");
        int anassur = scanner.nextInt();


        String tarif = "Refusé";

        if (age < 25) {
            if (anpermis < 2) {
                if (accident == 0) {
                    tarif = "Rouge";
                }
            } else {
                if (accident == 0) {
                    tarif = "Orange";
                } else if (accident == 1) {
                    tarif = "Rouge";
                }
            }
        } else {
            if (anpermis < 2) {
                if (accident == 0) {
                    tarif = "Orange";
                } else if (accident == 1) {
                    tarif = "Rouge";
                }
            } else {
                if (accident == 0) {
                    tarif = "Vert";
                } else if (accident == 1) {
                    tarif = "Orange";
                } else if (accident == 2) {
                    tarif = "Rouge";
                }
            }
        }
        if (anassur > 5) {
            if (tarif == "Vert") {
                tarif = "Bleu";
            } else if (tarif == "Orange") {
                tarif = "Vert";
            } else if (tarif == "Rouge") {
                tarif = "Orange";
            }
        }
        System.out.println("Le tarif attribué est : " + tarif);
        scanner.close();  
    }
}