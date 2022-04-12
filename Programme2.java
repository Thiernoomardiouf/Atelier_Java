import java.util.Scanner;

public class Programme2 {
    public static void main( String[] args ) {
        int a, b, c = 0;
        Scanner produit = new Scanner( System.in );
        System.out.println( "Introduire le premier nombbre: ");
        a = produit.nextInt();
        if ( a < 0){
            System.out.println( "Introduire un nombre positif");
            a = produit.nextInt();
        }
        System.out.println( "Introduire le seconde nombbre: ");
        b = produit.nextInt();
        if ( b < 0){
            System.out.println( "Introduire un nombre positif");
            b = produit.nextInt();
        }
        c = a * b;
        System.out.println( "Le produit de " + a + " et " + b + " est :"+ c );
        produit.close();
     }
}
