import java.util.Scanner;

public class Programme6 {
    public static void main( String[] args ) {
        int a, c = 0, i = 0 ;
        Scanner moyenne = new Scanner( System.in );
        while(i < 5){
            System.out.println( "Introduire un nombbre: ");
            a = moyenne.nextInt();
            if ( a > 0){
                i++;
                c = c + a;
            }
        }
        
        System.out.println( "La moyenne est :" + c/5 );
        moyenne.close();
     }
}
