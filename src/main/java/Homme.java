
public class Homme extends Mammifere implements ICarnivore, IHerbivore{

    private String langage;

// ----------------------------------------------------------------------------------------- CONSTRUCTEUR

    public Homme(){}

    public Homme(String iden){
        super(iden);
    }

    public Homme(String nom, int age){
        super(nom, age);
    }

    public Homme(String nom, int age, String langage){
        super(nom, age);
        this.langage = langage;
    }

    // ----------------------------------------------------------------------------------------- METHODE ABSTRAITE / INTERFACE

    public String moyenExpression(){
        return " Je parle !";
    }

    @Override
    public void manger(Animal a) {
        System.out.println("\tJe mange " + a.getIdentifiant() + ".");
    }

    @Override
    public void manger(Plante p) {
        System.out.println("\tJe mange " + p.getIdentifiant() + ".");
    }

    // ----------------------------------------------------------------------------------------- METHODE D'INSTANCE
    public String getInfo(){
        String str = super.getInfo();

        if(this.langage != null && getNom() != null){
            str += " Je suis un homme de nom " + getNom() + " et je parle " + this.langage + ".";
        }else if(getNom() != null){
            str += " Je suis un homme de nom " + getNom() + ".";
        }else{
            str += " Je suis un homme.";
        }

        return str;
    }
// -----------------------------------------------------------------------------------------
}