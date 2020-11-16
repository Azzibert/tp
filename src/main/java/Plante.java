public class Plante extends Vivant{
    private String identifiant;

    public Plante(){
    }

    public Plante(String iden){
        this.identifiant = iden;
    }

    public String getIdentifiant(){ return this.identifiant; }

    public String toString(){
        return "Je suis une plante.";
    }
}