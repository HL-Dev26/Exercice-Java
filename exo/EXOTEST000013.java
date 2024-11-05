import java.util.Scanner;

public class EXOTEST000013 {
           
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print(" Veuillez saisir un premier Nombre : ");
                double nombre1 = scanner.nextInt(0);
                System.out.print( " Veuillez saisir un second nombre : ");
                double nombre2 = scanner.nextInt();

                double moyenne = nombre1 + nombre2/2;

                System.out.println( " La moyenne entre " + nombre1 + " et " + nombre2 + " est de : " + moyenne );
                scanner.close();


            } 
              
    
}
