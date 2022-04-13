import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collection2 {
    public static void main(String[] args) {
        List <String> livre = new ArrayList<String>();
        Scanner live = new Scanner(System.in);

        livre.add("Kham Sa Réw");
        livre.add("Mariama Ba");
        livre.add("Sidi et Rama");

        for (int i = 0; i<3;i++){
            System.out.println( "Donner un livre ");
            livre.add(live.nextLine());
        }
        for (String s: livre ){
            System.out.println(s);
        }
        live.close();
    }
}
