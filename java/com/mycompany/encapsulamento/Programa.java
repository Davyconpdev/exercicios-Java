package com.mycompany.encapsulamento;

import entidade.Conta;
import entidade.ContaEspecial;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;
       
        
        System.out.print("Insira o numero da conta: ");
        int numero = sc.nextInt();
        
        System.out.print("Informe o titular da conta: ");
        sc.nextLine();
        
        String nome = sc.nextLine();
        
        System.out.print("Existe deposito inicial(y = sim / n = nao)?: ");
        char resposta = sc.next().charAt(0);
        
        if(resposta == 'y'){
            System.out.print("Insira o valor do deposito inicial: ");
            double depInicial = sc.nextDouble();
            
            System.out.print("Conta Especial(y = sim / n = nao)?:");
            char especial = sc.next().charAt(0);
            if(especial == 'y'){
                System.out.print("Informe o limite do emprestimo: ");
                double limiteEmprestimo = sc.nextDouble();
                 conta = new ContaEspecial(numero, nome, depInicial, limiteEmprestimo);
            }else{
                conta = new Conta(numero, nome, depInicial);
            }
           } else {
            conta = new Conta(numero, nome);
        }
        System.out.println();
        System.out.println("Dados da Conta:");
        System.out.println(conta);
        
        System.out.println();
        System.out.print("Insira um valor de deposito: ");
        double depValor = sc.nextDouble();
        conta.Depositar(depValor);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Insira um valor de saque: ");
        double saquevalor = sc.nextDouble();
        conta.Sacar(saquevalor);
        System.out.println("Dados da conta atualizados:");
        System.out.println(conta);
        
        if(conta instanceof ContaEspecial){
            ContaEspecial contaEsp = (ContaEspecial) conta;
            System.out.println("");
            System.out.print("Deseja pedir emprestimo(y = sim / n = nao)?:");
            char emprestimo = sc.next().charAt(0);
            if(emprestimo == 'y'){
               System.out.print("Insira o valor do emprestimo: ");
               double valEmprestimo = sc.nextDouble();
               contaEsp.Emprestimo(valEmprestimo);
                System.out.println("Dados da conta apos emprestimo.");
                System.out.println(contaEsp);
            }
        }   
        sc.close();  
    }
}

