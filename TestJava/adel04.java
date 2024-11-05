import java.util.Scanner;

public class adel04 {
       
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Lire le premier nombre ");
        int nb =  scan.nextInt();
        if (nb >= 0) {
            System.out.println(" Le nombre est positif ");
        }
        else    {
            System.out.println(" Le nombre est negatif ");
            
        }

    
   }
}