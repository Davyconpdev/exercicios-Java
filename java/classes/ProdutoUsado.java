package classes;

public class ProdutoUsado extends Produto{
    
    private String dataFabrica;
    
    public ProdutoUsado(String nome, double preco, String dataFabrica){
        super(nome, preco);
        this.dataFabrica = dataFabrica;
    }
    
    @Override
    public String etiquetaPreco(){
        return "\nProduto Usado: "+nome+
               "\nPreco: R$"+String.format("%.2f", preco)+
               "\nData de Fabricacao do Produto: "+dataFabrica+
                "\n";
    }
}
