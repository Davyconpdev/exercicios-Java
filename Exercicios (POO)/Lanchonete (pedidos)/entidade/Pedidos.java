package entidade;

import java.util.ArrayList;
import java.util.List;


public class Pedidos {
   
    protected List<Pedido> pedidos;
    private int Id;
    protected int cont = 1;
    
    
    public Pedidos(){
        this.pedidos = new ArrayList<>();
        this.Id = cont++;
    }
    
    public void AddItem(Pedido pedido){
        pedidos.add(pedido);
    }
    
    public double CalcularValorTotal(){
       double total = 0.0;
       for(Pedido pedido: pedidos){
           total += pedido.getPreco();
       }
       return total;
    }
  
    public void ExibirPedidos(){
       System.out.println("\nPedido ID: "+Id);
       for(Pedido pedido: pedidos){
            System.out.println(pedido.getNome()+" ("+pedido.Tipo()+")"+" -  R$"+pedido.getPreco());   
       }
       System.out.println("Valor Total: R$"+CalcularValorTotal());
       System.out.println("------------------------------------");
    }
}
