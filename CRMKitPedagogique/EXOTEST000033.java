import java.util.Scanner;

public class EXOTEST000033{
            /*Exercice 3.3 : Les nombres suivants
            Écrire un algorithme qui demande un nombre de départ, et qui ensuite affiche les dix nombres suivants.

            Par exemple, si l’utilisateur saisit le nombre 17, le programme affichera :

            Les 10 nombres après 17 sont: 18, 19 ,20 ,21 ,22 ,23 ,24 ,25 ,26 ,27

            Écrire cet algorithme dans un premier temps avec une boucle tant que, puis écrivez une 2nde version avec une boucle pour. */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir un numero: ");
        int numero = scanner.nextInt();
        int resultat = numero + 10;
        while (numero < resultat ) {
            //numero = numero + 1;
            //numero += 1;
            numero++;
            System.out.println( numero );
            
        }
    System.out.println(" Yes, you did it ! ");
        scanner.close(); 
    }
}
