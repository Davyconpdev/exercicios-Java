package entidade;

public class Bebida extends Pedido {
    
    public Bebida(String nome, double preco){
        super(nome, preco);
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
    @Override
    public String Tipo(){
        return "Bebida";
    }
}
