public class Enseignant {
    private String nom;
    private String prenom ;
    private int age;
    private int numeroCarte ;


    public Enseignant(){
        System.out.println("Ceci est un constructeur sans parametre");
    }

    public Enseignant(String _nom , String _prenom, int _numeroCarte, int _age){
        this.nom = _nom;
        this.prenom = _prenom ;
        this.age = _age;
        this.numeroCarte = _numeroCarte;

    }

    public Enseignant(Enseignant es){
        this(es.nom, es.prenom, es.age, es.numeroCarte);
    }
}
