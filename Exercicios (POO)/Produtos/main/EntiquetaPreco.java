package app;

import java.util.Scanner;
import classes.Produto;
import classes.ProdutoImportado;
import classes.ProdutoNormal;
import classes.ProdutoUsado;
import java.util.ArrayList;
import java.util.List;

public class EntiquetaPreco {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();
        
        System.out.print("Quantidade de Produtos: ");
        int n = s.nextInt();
        s.nextLine();
        
        for(int i = 0; i < n; i++){
            
          System.out.print("Tipo do Produto (Normal, Importado ou Usado): ");
          String tipo = s.nextLine();
          System.out.print("Nome do Produto: ");
          String nome = s.nextLine();
          System.out.print("Preco do Produto: ");
          double preco = s.nextDouble();
          s.nextLine();
          
          switch(tipo.toLowerCase()){
         
            case "normal":
                produtos.add(new ProdutoNormal(nome,preco));
                break;
            
            case "importado":
                System.out.print("Taxa da Alfandega: ");
                double taxaAlfandega = s.nextDouble();
                s.nextLine();
                produtos.add(new ProdutoImportado(nome,preco,taxaAlfandega));
                break;
                
            case "usado":
                System.out.print("Data de Fabricacao (dd/mm/aaaa): ");
                String dataFabrica = s.nextLine();
                produtos.add(new ProdutoUsado(nome,preco,dataFabrica));
            break;
          
            default:
                System.out.print("Tipo de Produto nao cadastrado: ");
                i--;
                break;
        }
        }
        
        System.out.print("\nEntiqueta de Precos.");
        for(Produto produto: produtos){
            System.out.print(produto.etiquetaPreco());
        }    
    }
}
