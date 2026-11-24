public class Personne {
    protected String nom ;
    protected String prenom ;
    protected int age ;
    protected int numeroCarte ;

    public String getSepresenter(){
        return "Salut a tous"+
                " Je suis"+
                this.nom+ " "+ this.prenom +
                "J'ai "+ this.age+ " ans";
    }
}
