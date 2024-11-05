import java.util.Scanner;

public class EXOTEST000014 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double aire, volume;
        System.out.println("");
        System.out.print(" définir rayon : ");
        double rayon = scanner.nextInt();

        aire = 4 * Math.PI * Math.pow(rayon, 2);
        volume = (4 * Math.PI * Math.pow(rayon, 3)) / 3;

        System.out.println("Avec un rayon de : " + rayon);
        System.out.println(" L'aire de la sphère est de : " + aire);
        System.out.println(" Le volume de la sphére est de : " + volume);

        scanner.close();
    }

}