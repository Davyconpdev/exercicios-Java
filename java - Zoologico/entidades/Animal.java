package entidades;

public abstract class Animal {
    
    protected String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public String GetNome(){
        return nome;
    }
    
    public String GetTipo(){
        return this.getClass().getSimpleName();
    }
    
    public abstract void EmitirSom();
}
