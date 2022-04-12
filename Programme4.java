import java.util.Scanner;

public class Programme4 {
    public static void main( String[] args ) {
        int a, b, c = 0;
        Scanner division = new Scanner( System.in );
        System.out.println( "Introduire le numérateur nombbre: ");
        a = division.nextInt();
        if ( a < 0){
            System.out.println( "Introduire un nombre positif");
            a = division.nextInt();
        }
        System.out.println( "Introduire le dénominateur nombbre: ");
        b = division.nextInt();
        if ( b < 0){
            System.out.println( "Introduire un nombre positif");
            b = division.nextInt();
        }
        c = a / b;
        System.out.println( "La division de " + a + " et " + b + " est :"+ c );
        division.close();
     }
}
