//Mini-exercice
//
//Écris un programme qui affiche les nombres de 1 à 20, mais :
//
//affiche "Multiple de 3" si le nombre est divisible par 3 ;
//
//affiche sinon le nombre lui-même.


// sOLUTION

import java.util.Scanner;

public class miniexercice {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("PREMIER MINI-EXERCICES AVEC JAVA ");
        System.out.println("---------------------------------");

        Scanner lire = new Scanner(System.in);
        System.out.println("Entrer un nombre entier : ");
        byte valeur = lire.nextByte(); //Lecture d'un byte


        for (byte i = 1; i <= valeur; i++) {
            if (i % 3 == 0) {
                System.out.println("Le nom " + i + " est divisible par 3");
            } else {
                System.out.println(i);
            }
        }

        //Un petit code d'enregistrement de plusieur etudiants
        String nom, prenom, ecole, filiere;
        int id;
        byte age;
        //float note ;
        System.out.println("_-------------------------------------------------------------");
        System.out.println("BIENVENU DANS MON PROGRAMME D'ENREGISTREMENT CONSOLE AVEC JAVA");
        System.out.println("_-------------------------------------------------------------");

        System.out.println("Entrer le nombre d'etudiant inscrits : ");
        int eleve = lire.nextInt(); //Lecture du nombre des etudiant entrer

        for (int i = 1; i <= eleve; i++) {
            System.out.println("Voulez-vous continuer :(1.OUI\n2.NON");
            byte choix = lire.nextByte();
            if (choix == 1) {
                System.out.println("\t__Etudiant " + i);

                System.out.println("Votre identifiant :");
                id = lire.nextInt();

                System.out.println("Nom : ");
                nom = lire.nextLine();

                System.out.println("Prenom :");
                prenom = lire.nextLine();

                System.out.println("Age :");
                age = lire.nextByte();

                System.out.println("Ecole :");
                ecole = lire.nextLine();

                System.out.println("Filiere :");
                filiere = lire.nextLine();
            } else {
                System.out.println("<<<<<<<<<<<<<<<<<<FIN DU PROGRAMME>>>>>>>>>>>>>>");
                break;
            }
        }
    }

}