public class exo10fred {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
   
 
         // programme pour convertir un nombre binaire inferieur à 1111 1111 en hexadecimal
        System.out.println("programme pour convertir un nombre binaire inferieur à 1111 1111 en hexadecimal");
 
         // déclaration des variables
 
        int b0 =1;
        int b1 =1;
        int b2 = 0;
        int b3 = 1;
        int b4 = 1;
        int b5 = 0;
        int b6 = 0;
        int b7 = 0;
 
        int dec = 0;
 
        String hexa;
 
 
 
        // conversion du binaire en décimal
 
        dec = b0*1 + b1*2 + b3*4 + b3*8 + b4*16 + b5*32 +b6*64 + 2*128;
 
 
        // conversion du decimal en hexadécimal
 
 
        hexa = Integer.toHexString(dec);
 
        //Affichage du résultat
 
        System.out.println("le résultat attendu est : " + hexa);
   
 
 
 
     }

}
