import java.util.Scanner;

public class Programme7 {
    public static void main( String[] args ) {
        int a ;
        Scanner moyenne = new Scanner( System.in );
        System.out.println( "Introduire un nombbre: ");
        a = moyenne.nextInt();
        
        if( a > 0){ 
            System.out.println( "Le nombre est positif");
        } else if ( a < 0 ){
            System.out.println( "Le nombre est négatif" );
         } else {
            System.out.println( "Le nombre est nul" );
         }
        moyenne.close();
     }
}
