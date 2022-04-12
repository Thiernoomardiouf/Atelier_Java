import java.util.Scanner;

public class Programme1 {

   public static void main( String[] args ) {
    int a, b, c = 0;
    Scanner somme = new Scanner( System.in );
    System.out.println( "Introduire le premier nombbre: ");
    a = somme.nextInt();
    if ( a < 0){
        System.out.println( "Introduire un nombre positif");
        a = somme.nextInt();
    }
    System.out.println( "Introduire le seconde nombbre: ");
    b = somme.nextInt();
    if ( b < 0){
        System.out.println( "Introduire un nombre positif");
        b = somme.nextInt();
    }
    c = a + b;
    System.out.println( "La somme de " + a + " et " + b + " est :"+ c );
    somme.close();
 }
    
}
