import java.util.Scanner;

public class EXOTEST000032
 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;

        
        while (nombre < 10 || nombre > 20) {
            System.out.println(" Rentrer un nombre compris entre 10 et 20 : ");
            nombre = scanner.nextInt();
            if (nombre > 9) {
                System.out.println(" Plus Petit ");   
            }
            else if (nombre < 11) {
                System.out.println(" Plus Grand ");
          }
          

        }
    System.out.println(" Yes, you did it ! ");
        scanner.close(); 
    }
}
