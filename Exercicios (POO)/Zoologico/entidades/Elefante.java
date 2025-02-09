package entidades;

public class Elefante extends Animal{
    
    public Elefante(String nome){
        super(nome);
    }
        
    @Override
    public void EmitirSom(){
        System.out.println("\n"+this.GetNome()+" Elefante vai Bramir");
    }
}
