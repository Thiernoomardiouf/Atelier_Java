import java.util.Scanner;

public class atelier2_5 {
    public static void main(String[] args) {
        int a, somme=0;
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
            somme = somme +  tableau[i];
        }
        
        System.out.println("La moyenne des éléments du tableau est " + somme / a);
        nombre.close();
        
    }
}
