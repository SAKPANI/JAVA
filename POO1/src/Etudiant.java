public class Etudiant {
    String nom ;
    String prenom;
    int age ;
    int numeroCarte;
    int nombreTotale ;

    public Etudiant(String nom , String prenom, int age, int numeroCarte){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numeroCarte = numeroCarte;
        nombreTotale ++ ;`
    }

    public void sePresenter(){
        System.out.println("Je suis "+ this.nom + " "+ this.prenom +" J'ai "+this.age + " ans");
    }

    public String getNom(){
        return nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    boolean estEgal(Etudiant e){
        return this.numeroCarte == e.numeroCarte;
    }

    public static void afficherTotale(int nombreTotale){
        System.out.println("le nombre totale d'etudiant : " + Etudiant.nombreTotale);
    }
}
