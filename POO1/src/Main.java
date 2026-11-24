
public class Main{
    public static void main(String [] args){
       Etudiant e1 =new Etudiant("kofi", "Sopo", 19, 123);
       Etudiant e2 = new Etudiant("Kaii", "Senaya", 13, 13);
       //e1.sePresenter();
       System.out.println(e1.estEgal(e1));
       Etudiant.afficherTotale();

       //Demande a l'utilisateur de d'entrer ces donnees
    }
}