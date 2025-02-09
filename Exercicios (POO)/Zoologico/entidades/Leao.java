package entidades;

public class Leao extends Animal{
    
    public Leao(String nome){
        super(nome);
    }
    
    @Override
    public void EmitirSom(){
        System.out.println("\n"+this.GetNome()+" Leao vai Rugir");
    }
    
}
