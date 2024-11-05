import java.util.Scanner;

public class EXOTEST000026 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir une année : ");
        int année = scanner.nextInt();

        if (année % 4 == 0 && (année % 100 != 0 || année % 400 == 0)) {
            System.out.println(" L'année " + année + " est bisextille");
        } else {
            System.out.println(" L'année " + année + " n'est pas bisextille");
        }
        scanner.close();

    }
}