package classes;

public class ProdutoImportado extends Produto{
    
    private double taxaAlfandega;
    
    public ProdutoImportado(String nome, double preco, double taxaAlfandega){
        super(nome, preco);
            this.taxaAlfandega = taxaAlfandega;
    }
    
    @Override
    public String etiquetaPreco(){
        double precoFinal = preco + taxaAlfandega;
            return "\nProduto Importado: "+nome+
                   "\nPreco: R$"+String.format("%.2f", precoFinal)+
                   "\nTaxa da Alfandega: R$"+String.format("%.2f", taxaAlfandega)+
                    "\n";
    }
}
