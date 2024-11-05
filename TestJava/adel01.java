import java.util.Scanner;

public class adel01 {
       
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Lire le premier nombre ");
        int nba =  scan.nextInt();
        System.out.println("Lire le deuxieme nombre ");

        int nbb = scan.nextInt();
        System.out.println(" A vaut : " + nba + " - B vaut : " + nbb);
        int nbx = nba;
        nba = nbb;
        nbb = nbx;
        System.out.println(" A vaut : " + nba + " - B vaut : "  + nbb);

    
   }
}