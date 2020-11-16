
/**
 * Classe Chien
 * Elle hérite de la classe Mammifère,
 * Qui hérite, elle aussi, de la super classe Animal
 * De plus, elle implémente l'interface Carnivore
 */

public class Chien extends Mammifere implements ICarnivore{

    /**
     * Attribut d'instance
     */

    private String taille;

    /*private ComportementCarnivore comportementCarnivore = new ComportementCarnivore();
    public void mange(Animal animal){
        comportementCarnivore.mange(animal);
    }*/

// ----------------------------------------------------------------------------------------- CONSTRUCTEUR
    /**
     * Constructeur par défaut de la classe Chien
     */

    public Chien(){}

    public Chien(String iden){
        super(iden);
    }

    /**
     * Constructeur prenant deux paramètres de la classe Chien
     * @param nom
     * @param age
     */

    public Chien(String nom, int age){
        super(nom, age);
    }

    /**
     * Constructeur prenant trois paramètres de la classe Chien
     * Appel du constructeur de la super-classe via le mot-clé "super"
     * @param nom
     * @param age
     * @param taille
     */

    public Chien(String nom, int age, String taille){
        super(nom, age);
        this.taille = taille;
    }
// ----------------------------------------------------------------------------------------- GETTEUR

    /**
     * Getteur qui retourne la taille d'un chien
     * @return
     */

    public String getTaille(){ return this.taille; }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE / INTERFACE

    public String moyenExpression(){
        return " J'aboie !";
    }

    //@Override
    public void manger(Animal a) {
        System.out.println("\tJe mords " + a.getIdentifiant() + ".");
    }

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE

    /**
     * Méthode d'instance
     * redéfinition de la méthode getInfo()
     * @return caractéristique d'un chien
     */

    public String getInfo(){
        String str = super.getInfo();

        if(this.taille != null && getNom() != null){
            str += " Je suis un chien de nom " + getNom() + " de " + this.taille + " taille.";
        }else if(getNom() != null){
            str += " Je suis un chien de nom " +getNom() + ".";
        }else{
            str += " Je suis un chien.";
        }

        return str;
    }
// -----------------------------------------------------------------------------------------
}