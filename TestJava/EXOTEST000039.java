import java.util.Scanner;

public class EXOTEST000039
 {
    public static int factorielle(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
        result *= i;
    }
        return result;
    }  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Saisir le nombre de chevaux partant(s) :");
            int partant = scanner.nextInt();
            System.out.print(" Saisir le nombre de chevaux jouée(s) :");
            int joues = scanner.nextInt();
        int ordre = 0;
        int desordre = 0;
        ordre = factorielle(partant) / factorielle(partant - joues);
        desordre = factorielle(partant) / (factorielle(joues) * factorielle(partant - joues));
        
        System.out.println("Dans l ordre : une chance sur " + ordre + " de gagner ");
        System.out.println("Dans le désordre : une chance sur " + desordre + " de gagner  ");

        scanner.close(); 
    }
}
