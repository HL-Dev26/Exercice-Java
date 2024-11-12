import java.util.Scanner;

public class EXOTEST000038
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double toto = 0.0;
        double rendre = 0.0;
        int b5 = 0;

        while (true) {
            System.out.print(" Saisir prix d'un article: ");
            double article = scanner.nextDouble();
            if (article == 0) {
                break;
            }
            toto += article;
        }
        System.out.println(" le total des articles est de : " + toto + " Euros ");

        if (toto % 5 == 0) {
            b5 = (int) toto / 5;
            
        }
        else{
            b5 = (int) toto /5 + 1;
        }
        rendre = (b5 * 5) - toto;
        double rrendre = Math.round(rendre*100.0)/100.0;
        System.out.println("Le client donne : " + b5 + " billets de 5 Euros");
        System.out.println(" à rendre : " + rrendre + " Euro ");


        double [] pieces = { 2 , 1 , 0.50 , 0.20 , 0.10 };

        System.out.println(" Répartition de la monnaie à restituer au client :");
        for (int i = 0; i < pieces.length; i++) {
            int cp = 0;
            while (rrendre >= pieces [i])  {
            rrendre = rrendre - pieces [i];
            cp += 1;

            }
            if (cp > 0) {
                System.out.println(cp + " pièce de " + pieces [i]);
            }    
        }
        scanner.close(); 
    }
}
