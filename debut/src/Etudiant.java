public class Etudiant {
    /**Un attribut ou propriété ou encore variable d’instance
    doit juste être déclaré dans le corps de la classe.**/

    static int compteur ; //Declaration
    String nom;
    String prenom ;
    int age ;// Pour un seul etudiant

    /**Chaque instance de la classe a accès à sa propre
     occurrence de la variable.


     * L’accès à un attribut de classe peut se faire soit à travers une
     * 18
     * instance de cette classe soit à travers la classe elle-même par
     * son nom*/

    Etudiant  etudiant  = new Etudiant();
    int c = etudiant.compteur;


    //modificateurs type_de_retour nom_méthode ( arg1, ... ) {... }
    void modifierNom(String _nom){
        this.nom = nom;
    }


    //une methode pour voir la ou afficher la valeur
    String obtenirNom(){
        return this.nom;
    }

}

