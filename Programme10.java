import java.util.Scanner;
import java.io.IOException;

public class Programme10 {
    public static void main (String[] argv) throws IOException
   {
    
    Scanner moyenne = new Scanner( System.in );
    System.out.println( "Introduire un entier: ");
    int a = moyenne.nextInt();
    System.out.println( "Introduire un decimal: ");
    float b = moyenne.nextFloat();
    
    System.out.println("Donner votre nom") ;
    moyenne.nextLine();
    String NOM= moyenne.nextLine();
    System.out.println("Votre nom est : "+ NOM);
    System.out.println("L'entier est : "+ a);
    System.out.println("Le nombre decimal est : "+ b);
    moyenne.close();
  } 
}
