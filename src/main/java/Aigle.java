public class Aigle extends Oiseau implements ICarnivore{

    private String habitat;

    // ----------------------------------------------------------------------------------------- CONSTRUCTEUR
    public Aigle(){}

    public Aigle(String iden){
        super(iden);
    }

    public Aigle(String nom, int age){
        super(nom, age);
    }

    public Aigle(String nom, int age, String habitat){
        super(nom, age);
        this.habitat = habitat;
    }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE / INTERFACE

    public String moyenExpression(){
        return " Je glatis !";
    }

    @Override
    public void manger(Animal a) {
        System.out.println("\tJe déchire " + a.getIdentifiant() + ".");
    }

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE

    public String getInfo(){
        String str = super.getInfo();

        if(this.habitat != null && getNom() != null){
            str += " Je suis un aigle de nom " + getNom() + " et je vis sur " + this.habitat + ".";
        }else if(getNom() != null){
            str += " Je suis un aigle de nom " + getNom() + ".";
        }else{
            str += " Je suis un aigle.";
        }

        return str;
    }

// -----------------------------------------------------------------------------------------
}