import java.util.Scanner;

public class Personne {
        private String matricule;
        private String nom;
        private String prenom;
        private String dateDenaissance;
        private String lieuDenaissance;
        private String telephone;

        public Personne(String matricule, String nom, String prenom, String dateDenaissance, String lieuDenaissance, String telephone){
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

        System.out.println( "Donner le matricule: ");
        String matricule= person.nextLine();
        System.out.println( "Donner le nom: ");
        String nom= person.nextLine(); 
        System.out.println( "Donner le prenom: ");
        String prenom= person.nextLine();
        System.out.println( "Donner votre date de naissance: ");
        String dateDenaissance= person.nextLine();
        System.out.println( "Donner votre lieu de naissance: ");
        String lieuDenaissance= person.nextLine();
        System.out.println( "Donner votre date de naissance: ");
        String telephone= person.nextLine();

        Personne Person1 = new Personne(matricule, nom, prenom, dateDenaissance, lieuDenaissance, telephone);
        Person1.afficher();
        person.close();
        
    }
}
