package entidade;

public abstract class Pedido {
    
    protected String nome;
    protected double preco;
    
    public Pedido(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }  
    
    public abstract String Tipo();
}
