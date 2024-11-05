public class exo9hul {
      
    public static void main(String[] args) {
        
        int base = 244;
    
    
        int quotient = base/2;
        int R0 = base % 2;

        int R1 = quotient % 2;
        quotient = quotient/2;

        int R2 = quotient % 2;
        quotient = quotient/2;

        int R3 = quotient % 2;
        quotient = quotient/2;

        int R4 = quotient % 2;
        quotient = quotient/2;

        int R5 = quotient % 2;
        quotient = quotient/2;

        int R6 = quotient % 2;
        quotient = quotient/2;

        int R7 = quotient % 2;
        quotient = quotient/2;

        System.out.println(base +  " en binaire " + R7 + R6 + R5 + R4 + R3 + R2 + R1 + R0);
    }
}
