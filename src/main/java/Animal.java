
import java.util.ArrayList;
import java.util.List;

/**
 * Classe Animal
 * Elle hérite de la super classe Vivant
 * Elle est abstraite
 */
public abstract class Animal extends Vivant{

    /**
     * Attributs d'instances
     */

    private int age;
    private String nom;
    //private final String nom;
    private String identifiant;

    /**
     * Attributs de classes
     */

    private static int NB_MAX_ANIMAUX = 5;
    private static List<Animal> animaux = new ArrayList<>();
// ----------------------------------------------------------------------------------------- CONSTRUCTEUR

    /**
     * Constructeur par défaut
     */

    public Animal() {}

    /**
     * Constructeur simple
     * @param age
     */

    public Animal(int age){
        this.age = age;
    }

    public Animal(String iden){
        this.identifiant = iden;
    }

    /**
     * Constructeur prenant deux paramètres
     * @param nom
     * @param age
     */

    public Animal(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

// ----------------------------------------------------------------------------------------- GETTEUR

    /**
     * Getteurs
     *
     */

    public int getAge() { return age; }
    public String getNom() { return nom; }
    public String getIdentifiant(){ return this.identifiant; }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE

    /**
     * Méthode abstraite qui sera définit dans les sous-classes
     */

    public abstract String moyenExpression();

// ----------------------------------------------------------------------------------------- METHODE DE CLASSE

    /**
     * Getteur qui retourne la List d'animaux
     * @return
     */
    public static List<Animal> getTabAnimals(){ return animaux; }

    /**
     * Méthode de classe qui vérifie que l'on crée pas plus de NB_MAX_ANIMAUX
     * @return true or false
     */

    public static boolean maxiAnimal(){
        return animaux.size() >= NB_MAX_ANIMAUX;
    }

    /**
     * Méthode de classe qui ajoute un animal dans un tableau dynamique animaux
     * @param animal
     */

    public static void ajouterAnimal(Animal animal){
        if(animaux.size() < NB_MAX_ANIMAUX){
            animaux.add(animal);
        }
    }

    /**
     * Méthode de classe qui prends un tableau de type Animal
     * Affiche leur description et leur cris
     * @param animaux
     */

    public static void afficherAnimaux(Animal [] animaux){
        for(Animal a : animaux){
            System.out.print(a.getInfo());
            System.out.println(a.moyenExpression());
        }
    }

    public static void afficherAnimaux2(List<Animal> animaux){
        for(Animal a : animaux){
            System.out.print(a.getInfo());
            System.out.println(a.moyenExpression());
        }
    }

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE
    /**
     * Méthode d'instance
     * @return la description d'un animal
     */

    public String getInfo() {
        String str = "";
        if(age !=  0){
            str = "\tJe suis un animal âgé de " + this.age + " an(s).";
        }else{
            str = "\tJe suis un animal.";
        }
        return str;
    }

    public String toString(){
        return "Je suis un animal.";
    }
// -----------------------------------------------------------------------------------------
}
