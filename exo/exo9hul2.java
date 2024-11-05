public class exo9hul2 {
    public static void main(String[] args) {
       
        int dec = 6300;
        int quotient = dec ;
        int  reste = 0;
        String bin = "";
       
        while (quotient > 0) {
            reste = quotient % 2;
            quotient = quotient / 2;
 
            bin = reste + bin ;
       
        }
        System.out.println();
        System.out.print(bin);
    }
}
 