import java.util.Scanner;

public class ControleBoucleDoWile {
    public static void main( String[] args ) {
        
        int i;
        Scanner nombre = new Scanner(System.in);
        do{
            System.out.println( "Donner un nombre positif : ");
            i= nombre.nextInt();
        } while(i<0);
        nombre.close();
     }
}
