public class Premierpas {
    public static void main(String[] args){
        System.out.println("Salut le monde alors moi c'est pagui je debute " +
                "en programmation oriente objet\n avec java et je suis " +
                "tres content d'ecrire ce texte, haha j'ai aussi souffert " +
                "avant que ce texte ce s'affiche\n car  le debeugeur me montrait" +
                " qu'il y'avait plusieur erreurs dans mon code ,et je suis tres" +
                " content\n pour ca car cela m'a permit d'apprendre plein de chose, " +
                "surtout pour un debutant comme moi.\n Mais je suis pas debutant en programmation , " +
                "hein , je code en C et python , voila et j'espers\n que jusqu'a la fin de ce " +
                "Semestre 3 a l'ENP ex EPL , je serai un boss en matiere de programmation java");

        // Les  variable et types

        //Declaration de variable de types numerique entiers
        int var_int  = 343000; //Valeur comprise entre [-2 MD, +2MD],  on l'utilise par defaut , donc ha si ca me chauffe int sera la pour moi. haaaaa
        byte var_byte = 21;  //Le plus petit type en java [-128, +128]
        short var_court = 34; //Stock des nombbre un peu plus grand [-32768, 32767]
        long lg = 1364748929; //stockage des nombres tres grand +2 MILLIARDS

        //Stockage des nombres a virgule(decimale)
        float reel  = 0.14f;
        double double_float= 0.0000056d;
        String texte = "Je suis SAKPANI Paguiyedou";

        //Pour les type char

        System.out.println("-------------------------------");
        System.out.println("1 -DECLARATION DES VARIABLES ");
        System.out.println("------------------------------");

        System.out.println("__________________________________________");
        System.out.println("LES VARIABBLES DE TYPES ENTIERS(NUMERIQUES)");
        System.out.println("__________________________________________");
        System.out.println("\nAffichage du contenu variable  byte :"+ var_byte);
        System.out.println("Affichage du contenu de la variable int :"+var_int);
        System.out.println("Affichage du contenu de la variable short :"+var_court);
        System.out.println("Affichage du contenu de la variable long :"+lg);
        System.out.println("Affichage du contenu de la variable texte : "+texte);

    }
}


