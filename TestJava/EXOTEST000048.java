//import java.util.Arrays;
import java.util.Scanner;

public class EXOTEST000048{

    /*Exercice 4.8 : Recherche dans un tableau
Écrire un algorithme permettant, toujours sur le même principe, à l’utilisateur de saisir un nombre déterminé de valeurs.
Le programme, une fois la saisie terminée, renvoie la plus grande valeur en précisant quelle position elle occupe dans le tableau.
On prendra soin d’effectuer la saisie dans un premier temps, et la recherche de la plus grande valeur du tableau dans un second temps.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir le nombre d'entre du talbleau : ");
        int numero = scanner.nextInt();

        int[] tabl = new int[numero];
        int pgrand = 0;
        int resultat = 0 ;

        for (int i = 0; i < tabl.length ; i++) {
        System.out.print(" Saisir la valeur " + ( i + 1 ) + " du tableau : " );
        tabl[i] = scanner.nextInt();
            if (tabl[i] > pgrand ) {
                 pgrand = tabl[i];
                resultat = i + 1;
            }    
        }
        System.out.println("Résultat :");
        System.out.println("Le plus grand des nombres saisis est : " + pgrand + ".");
        System.out.println(pgrand + " était le nombre numéro " + resultat + ".");
        
        scanner.close();
    }

}