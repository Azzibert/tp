import java.awt.*;
import java.sql.SQLOutput;
import java.util.logging.LoggingPermission;

public class Test {
    public static void main( String[] args )
    {
        /* --------------------- */ System.out.println("### TP2 ###"); /* --------------------- */

        System.out.println("--- Création d'un tableau d'instances de type Animal");

        Animal [] animaux = {new Chien(), new Chien("Toa", 10), new Lapin("Bunny", 3, "blanc"),
                new Homme("AZIBER", 23, tchadien), new Aigle("Grand aigle", 5, "terre")};

        for(Animal a : animaux){
            if(!Animal.maxiAnimal()){
                Animal.ajouterAnimal(a);
                System.out.println(a.getInfo());
            }
        }

        /* --------------------- */ System.out.println("\n"); /* --------------------- */

        System.out.println("--- Classes abstraites");

        Animal.afficherAnimaux2(Animal.getTabAnimals());

        /* --------------------- */ System.out.println("\n"); /* --------------------- */

        System.out.println("--- Partie Interface");

        Animal victime1 = new Lapin("lapin007");
        Plante victime2 = new Plante("Carotte01");

        ICarnivore [] tab = {new Chien(), new Homme(), new Aigle()};
        IHerbivore [] tab2 = {new Lapin(), new Homme()};

        for(ICarnivore c : tab){
            c.manger(victime1);
        }

        System.out.println("\n");

        for(IHerbivore h : tab2){
            h.manger(victime2);
        }

    }
}