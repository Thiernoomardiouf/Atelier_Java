import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Programme9 {
 public static void main (String[] argv) throws IOException
   {
    
    Scanner moyenne = new Scanner( System.in );
    System.out.println( "Introduire un entier: ");
    int a = moyenne.nextInt();
    System.out.println( "Introduire un decimal: ");
    float b = moyenne.nextFloat();
    BufferedReader entree = new BufferedReader (new InputStreamReader(System.in));
    System.out.println("Donner votre nom") ;
    String NOM= entree.readLine();
    System.out.println("Votre nom est : "+ NOM);
    System.out.println("L'entier est : "+ a);
    System.out.println("Le nombre decimal est : "+ b);
    moyenne.close();
  } 
}
