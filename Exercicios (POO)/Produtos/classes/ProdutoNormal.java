package classes;

public class ProdutoNormal extends Produto{
    
    public ProdutoNormal(String nome, double preco) {
        super(nome, preco);
    }
    
    @Override
    public String etiquetaPreco(){
        return "\nProduto: "+nome+
               "\nPreco: R$"+String.format("%.2f",preco);
    }
}
