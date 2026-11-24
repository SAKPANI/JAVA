public class Etudiant {
    private String nom;
    private String prenom;
    private int age;
    private int numeroCarte;


    public Etudiant() {
        System.out.println("Ceci est un constructeur");
    }

    public Etudiant(String nom, String prenom , int age , int numeroCarte){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numeroCarte = numeroCarte;
    }

    public Etudiant(Etudiant e){
        this(e.nom, e.prenom, e.age, e.numeroCarte);
    }

}