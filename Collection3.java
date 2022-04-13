import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection3 {
    public static void main(String[] args) {
        List <String> livre = new ArrayList<String>();
        Scanner live = new Scanner(System.in);

        livre.add("Kham Sa Réw");
        livre.add("Mariama Ba");
        livre.add("Sidi et Rama");

        for (int i = 0; i<4;i++){
            System.out.println( "Donner un livre ");
            livre.add(live.nextLine());
        }
        System.out.println("La collection avant suppresion");
        for (String s: livre ){
            System.out.println(s);
        }
        System.out.println("La collection numéro 3: "+ livre.get(2));
        livre.remove(4);
        System.out.println("La collection après suppresion");
        for (String s: livre ){
            System.out.println(s);
        }
        live.close();
    }
}
