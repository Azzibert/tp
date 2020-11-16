public abstract class Oiseau extends Animal {

// ----------------------------------------------------------------------------------------- CONSTRUCTEUR

    public Oiseau(){}

    public Oiseau(String iden){
        super(iden);
    }

    public Oiseau(String nom, int age){
        super(nom, age);
    }

// ----------------------------------------------------------------------------------------- METHODE ABSTRAITE

    public abstract String moyenExpression();

// ----------------------------------------------------------------------------------------- METHODE D'INSTANCE

    public String getInfo(){
        return super.getInfo() + " Je suis un oiseau.";
    }

}