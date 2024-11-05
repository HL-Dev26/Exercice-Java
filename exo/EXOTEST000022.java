import java.util.Scanner;

public class EXOTEST000022 {

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print(" Saisir un nombre entier : ");
        int nb1 = scanner.nextInt();
        System.out.print(" Saisir un nommbre 2 entier : ");
        int nb2 = scanner.nextInt();

        if (nb1*nb2 >= 0) {
            System.out.println((nb1*nb2) + " Le nombre est positif.");

        } else {
            System.out.println((nb1*nb2) + " Le nombre est négatif.");
        }
            scanner.close();

    }

}
