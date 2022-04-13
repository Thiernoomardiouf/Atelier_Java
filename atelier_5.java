import java.util.Scanner;

public class atelier_5 {
    public static void main(String[] args) {
        int a;
        Scanner nombre = new Scanner( System.in );
        System.out.println( "Introduire la taille du tableau: ");
        a = nombre.nextInt();
        if ( a < 0){
            System.out.println( "Introduire un nombre positif");
            a = nombre.nextInt();
        }
        int[] tableau = new int[a];
        for(int i: tableau){
            System.out.println( "Donner un nombre positif");
            tableau[i] = nombre.nextInt();
        }
        for(int i: tableau){
            System.out.println(tableau[i]);
        }
        nombre.close();
        
    }
}
