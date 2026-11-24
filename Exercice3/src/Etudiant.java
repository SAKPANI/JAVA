public class Etudiant {
    private String  nom;
    private String prenom;
    private int age ;

    public Etudiant(String _nom, String _prenom , int _age){
        this.nom  = _nom;
        this.prenom = _prenom;
        this.age = _age;
    }

    public void sePresenter(){
        System.out.print("- Je suis ");
        System.out.print(this.nom+ " "+this.prenom+ ".");
        System.out.print("J'ai "+ this.age+ " ans\n");
    }
    //Afficher le nom
    public String getNom(){
        return nom;
    }

    //Modifier le nom  et p
    public void setNom(String nom){
        this.nom= nom;
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
}

//Creation de la classe enseignant

class Enseignant{
    private String nom ;
    private String prenom;
    private int age ;
    private float salaire ;
    private String Ue ;



    public Enseignant(String _nom, String _prenom, int _age ){
        this.nom = _nom;
        this.prenom = _prenom;
        this.age = _age;
    }

    public void presenteToi(){
        System.out.print("- Je suis ");
        System.out.print(this.nom+ " "+this.prenom+ ".");
        System.out.print("J'ai "+ this.age+ " ans\n");
    }
}

public void main(String[] args){
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("\t>>>   PRESENTATION DES ETUDIANTs    <<<");
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    Etudiant etudiant1 = new Etudiant("AMAH", "Kwatcha", 18);
    etudiant1.sePresenter();
    etudiant1.setAge(22);
    etudiant1.sePresenter();
    Etudiant etudiant2 = new Etudiant("ABALO", "Afi", 21);
    etudiant2.sePresenter();
    Etudiant etudiant3 = new Etudiant ("AKAKPO", "Tcha-Esso", 21);
    etudiant3.sePresenter();

    //Question 6 :
    Etudiant etudiant4 = new Etudiant("PALOU", "Yendu", 18);
    etudiant4.sePresenter();

    //Presention des eneignants
    System.out.println("\n+++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("\t>>>   PRESENTATION DES ENSEIGNANTS   <<<");
    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++\n");
    Enseignant enseignant1 = new Enseignant("Dr. AYELEH", "Yendu", 35);
    enseignant1.presenteToi();
    Enseignant enseignant2 = new Enseignant("Dr. ABISSI", "Polo", 56);
    enseignant2.presenteToi();
    Enseignant enseignant3= new Enseignant("Dr. PAGUI", "Honore", 40);
    enseignant3.presenteToi();


}
