import java.util.Scanner;
import java.util.ArrayList;

public class PersonneFini {
    private String matricule;
    private String nom;
    private String prenom;
    private String dateDenaissance;
    private String lieuDenaissance;
    private String telephone;

    public PersonneFini(String matricule, String nom, String prenom, String dateDenaissance, String lieuDenaissance, String telephone){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDenaissance = dateDenaissance;
        this.lieuDenaissance = lieuDenaissance;
        this.telephone = telephone;
    }
    public void afficher(){
        System.out.println("La personne " + prenom + " "+nom);
        System.out.println("Il a pour matricule "+ matricule);
        System.out.println("Il est née en "+ dateDenaissance+" "+" à "+lieuDenaissance);
        System.out.println("Pour le contacter appeler au "+ telephone);
    }
    public static void main(String[] args) {
        Scanner person = new Scanner(System.in);
        
        ArrayList<PersonnePlus> tab = new ArrayList<PersonnePlus>();
        int reponse = 1;
        int j = 0;

        do{
            System.out.println("Veillez fournir les informations de la personnes ");
            System.out.println( "Donner le matricule: ");
            System.out.println();
            String matricule= person.nextLine();
            System.out.println( "Donner le nom: ");
            String nom= person.nextLine(); 
            System.out.println( "Donner le prenom: ");
            String prenom= person.nextLine();
            System.out.println( "Donner votre date de naissance: ");
            String dateDenaissance= person.nextLine();
            System.out.println( "Donner votre lieu de naissance: ");
            String lieuDenaissance= person.nextLine();
            System.out.println( "Donner votre téléphone: ");
            String telephone= person.nextLine();
            PersonnePlus Person = new PersonnePlus(matricule, nom, prenom, dateDenaissance, lieuDenaissance, telephone);
            tab.add(Person);
            j=j+1;

            System.out.println( "Voulez vous continuer ? Réponder par 1 pour continuer et 0 pour arréter");
            reponse = person.nextInt();
        } while(reponse == 1);


        for(int i=0;  i<j; i++){
            tab.get(i).afficher();
        }
        person.close();
    }
}
