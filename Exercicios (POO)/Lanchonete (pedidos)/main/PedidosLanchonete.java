package com.mycompany.pedidoslanchonete;

import entidade.Pedido;
import entidade.Comida;
import entidade.Bebida;
import entidade.Pedidos;
import java.util.Scanner;

public class PedidosLanchonete {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pedidos p = new Pedidos();
        
        boolean continua = true;
        while(continua){
            System.out.println("1 - Adicionar Comida.");
            System.out.println("2 - Adicionar Bebida.");
            System.out.println("3 - Finalizar Pedido.");
            System.out.println("4 - Sair");
            System.out.println("Escolha uma opcao: ");
            int opcao = s.nextInt();
            s.nextLine();
            
            switch(opcao){
                case 1:  
                    System.out.print("Digite qual a sua Comida: ");
                    String nomeC = s.nextLine();
                    System.out.print("Preco (R$): ");
                    double precoC = s.nextDouble();
                    s.nextLine();
                    p.AddItem(new Comida(nomeC,precoC));
                    break;
                    
                case 2:
                    System.out.print("Digite qual a sua Bebida: ");
                    String nomeB = s.nextLine();
                    System.out.print("Preco (R$): ");
                    double precoB = s.nextDouble();
                    s.nextLine();
                    p.AddItem(new Bebida(nomeB, precoB));
                    break;
                    
                case 3:
                    p.ExibirPedidos();
                    break;
                
                case 4:
                    System.out.println("Saindo...");
                    continua = false;
                    
                default:
                    System.out.println("Opcao Invalida; Tente novamente.");        
            }
        }
        s.close();
    }
}
