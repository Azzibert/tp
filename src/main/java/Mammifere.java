/**
 * Classe Mammifère
 * Elle hérite de la classe Animal
 * Elle est abstraite
 */
public abstract class Mammifere extends Animal {

    /**
     * Constructeur par défaut de la classe Mammifère
     */
// ----------------------------------------------------------------------------------------- CONSTRUCTEUR
    public Mammifere(){}

    public Mammifere(String iden){
        super(iden);
    }

    /**
     * Constructeur prenant deux paramètres
     * Appel du constructeur de la super-classe via le mot-clé "super"
     * @param nom
     * @param age
     */

    public Mammifere(String nom, int age){
        super(nom, age);
    }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE
    /**
     * Méthode abstraite qui sera redéfinit dans les sous-classes
     */

    public abstract String moyenExpression();

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE

    /**
     * Méthode d'instance
     * redéfinition de la méthode getInfo()
     * @return caractéristique d'un mammifère
     */

    public String getInfo(){
        return super.getInfo() + " Je suis un mammifère.";
    }
// --------------------------------------------------
}