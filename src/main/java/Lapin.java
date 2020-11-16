public class Lapin extends Mammifere implements IHerbivore{

    private String couleur;

// ----------------------------------------------------------------------------------------- CONSTRUCTEUR

    public Lapin(){}

    public Lapin(String iden){
        super(iden);
    }

    public Lapin(String nom, int age){
        super(nom, age);
    }

    public Lapin(String nom, int age, String couleur){
        super(nom, age);
        this.couleur = couleur;
    }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE / INTERFACE

    public String moyenExpression(){
        return " Je clapis !";
    }

    @Override
    public void manger(Plante p) {
        System.out.println("\tJe grignotte " + p.getIdentifiant() + ".");
    }

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE

    public String getInfo() {
        String str = super.getInfo();

        if(this.couleur != null && getNom() != null){
            str += " Je suis un lapin de nom " + getNom() + " de couleur " + this.couleur + ".";
        }else if(getNom() != null){
            str += " Je suis un lapin de nom " + getNom() + ".";
        }else{
            str += " Je suis un lapin.";
        }

        return str;
    }
// -----------------------------------------------------------------------------------------
}