import java.util.Scanner;

public class Programme3 {
    public static void main( String[] args ) {
        int a, b, c = 0;
        Scanner difference = new Scanner( System.in );
        System.out.println( "Introduire le premier nombbre: ");
        a = difference.nextInt();
        if ( a < 0){
            System.out.println( "Introduire un nombre positif");
            a = difference.nextInt();
        }
        System.out.println( "Introduire le seconde nombbre: ");
        b = difference.nextInt();
        if ( b < 0){
            System.out.println( "Introduire un nombre positif");
            b = difference.nextInt();
        }
        c = a - b;
        System.out.println( "La difference de " + a + " et " + b + " est : "+ c );
        difference.close();
     }
}
