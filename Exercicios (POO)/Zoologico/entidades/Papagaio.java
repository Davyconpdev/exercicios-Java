package entidades;

public class Papagaio extends Animal{
    
    public Papagaio(String nome){
        super(nome);
    }

    @Override
    public void EmitirSom(){
        System.out.println("\n"+this.GetNome()+" Papagaio vai Vozear");
    }
}
