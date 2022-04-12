import java.util.Scanner;

public class Programme8 {
    public static void main( String[] args ) {
        int a ;
        Scanner nombre = new Scanner( System.in );
        System.out.println( "Introduire un nombbre: ");
        a = nombre.nextInt();

        System.out.println( "La liste des nombres comprises entre 1 et " + a + " est : ");
        for ( int i = 1; i <= a; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        nombre.close();
     }
}
