// exercice pour découvrir les scanners
 
import java.util.Scanner;


public class exo9fred {


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
 
       
 
 
   
      Scanner sc = new Scanner(System.in);
      System.out.print("Entrez un nombre décimal : ");
      //lire le nombre décimal
      int nbr = sc.nextInt();
      String str = Integer.toBinaryString(nbr);
      System.out.println("Le nombre binaire est : "+str);
 
 

        // méthode avec boucle  
 
         int N = 9;
 
        int [] div = new int[7] ;

        int [] bit = new int[7] ;

        int i = 0;

        div[0] = N;

        while (div[i] > 1 ) {

        div[i+1] =  div[i] / 2;
 
        bit[i] = div[i]%div[i+1] ;

        System.out.println(bit[i]);

        i=i+1;

      }
 
 
 
    }
}
 