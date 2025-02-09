package entidade;

public class Comida extends Pedido {
      
    public Comida(String nome, double preco){
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
        return "Comida";
    }
}
