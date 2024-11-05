import java.util.Scanner;

public class EXOTEST000016 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir A : ");
        int a = scanner.nextInt();
        System.out.print(" Saisir B : ");
        int b = scanner.nextInt();

        System.out.println(" A = " + a + " et  B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" A = " + a + " et  B = " + b);
        scanner.close();
    }
}
