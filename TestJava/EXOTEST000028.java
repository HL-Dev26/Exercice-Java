import java.util.Scanner;

public class EXOTEST000028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Score du premier candidat : ");
        int cd1 = scanner.nextInt();
        System.out.print(" Score du deuxieme candidat : ");
        int cd2 = scanner.nextInt();
        System.out.print(" Score du troisieme candidat : ");
        int cd3 = scanner.nextInt();
        System.out.print(" Score du quatrieme candidat : ");
        int cd4 = scanner.nextInt();

        int somvoix = cd1 + cd2 + cd3 + cd4;
        int pourcentcd1 = cd1 * 100 / somvoix;

        if (pourcentcd1 >= 50) {
            System.out.println(" Le premier candidat Elu ");
        } else if (cd2 >= somvoix / 2 || cd3 >= somvoix / 2 || cd4 >= somvoix / 2) {
            System.out.println("Un autre candidat est Elu ");
        } else if ((pourcentcd1 >= 12.5) && (pourcentcd1 < 50) && (cd1 >= cd2 && cd1 >= cd3 && cd1 >= cd4)) {
            System.out.println(" Le premier candidat ballottage favorable ");
        } else if ((pourcentcd1 >= 12.5) && (cd1 <= cd2 || cd1 <= cd3 || cd1 <= cd4)) {
            System.out.println(" Le premier candidat ballottage defavorable ");
        } else if (pourcentcd1 < 12.5) {
            System.out.println(" Le premier candidat à perdu");
        }

        System.out.println();
        scanner.close();
    }
}