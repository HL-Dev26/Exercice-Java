import java.util.Scanner;

public class adel2 {
       
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Veuillez saisir un premier nombre : ");
        int nb1 = scan.nextInt();
        System.out.print("Veuillez saisir un second nombre : ");
        int nb2= scan.nextInt();
        System.out.println("La moyenne de " + nb1 + " et " + nb2 + " est : "+ (nb1+nb2) / 2.0 );
   }
}