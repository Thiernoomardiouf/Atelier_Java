import java.util.Scanner;
import java.util.InputMismatchException;

//Source : www.exelib.net

public class Calcul {

    public static int somme(int a, int b){
        return a + b;
    }
    public static int difference(int a, int b){
        return a - b;
    }
    public static int produit(int a, int b){
        return a*b;
    }
    public static float quotient(int a, int b){
            return  a / b;
    }
    public static void main(String[] args) throws IllegalArgumentException{

        while (true) {
			try {
                int a, b;
                Scanner nombre = new Scanner( System.in );
                System.out.println( "Introduire le premier nombre: ");
                a = nombre.nextInt();
                System.out.println( "Introduire le seconde nombre: ");
                b = nombre.nextInt();

                System.out.println( "La somme est : " + somme(a,b));
                System.out.println( "La difference est : " + difference(a,b));
                System.out.println( "Le produit est : " + produit(a,b));
                if ( b != 0){
                    System.out.println("La quotient est " + quotient(a,b));
                }else {
                    System.out.println("La division est impossible");
                }
                nombre.close();
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("Erreur de saisi");
			} 
		}
	

    }
    
}
