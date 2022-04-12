import java.util.Scanner;

public class TestValeur {
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
        c = a + b;
        if ( b > a){
            System.out.println(b + " est plus grand");
        } else{
            System.out.println(a + " est plus grand");
        }
        System.out.println( "Le somme de " + a + " et " + b + " est :"+ c );
        produit.close();
    }
}
