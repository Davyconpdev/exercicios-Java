package com.mycompany.atvdfuncionario;

import entidades.Funcionario;
import entidades.FuncionarioProprio;
import entidades.FuncionarioTerceirizado;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class AtvdFuncionario {
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Funcionario> f = new ArrayList<>();
        
        System.out.println("Informe a quantidade de funcionarios: ");
        int n = s.nextInt();
        s.nextLine();
          
        for(int i = 1; i <= n; i++){
        
            System.out.print("Nome do Funcionario: ");
            String nome = s.nextLine();
            
            System.out.print("Horas Trabalhadas: ");
            float horas = s.nextFloat();
            s.nextLine();
                
            System.out.print("Valor por Hora: ");
            float valor = s.nextFloat();
            s.nextLine();
            
            System.out.print("Funcionario é Treceirizado? (S = sim / N = não): ");
            char tipo = s.next().charAt(0);
            s.nextLine();
            
            if(tipo == 'S' || tipo == 's'){
                System.out.print("Valor da Despesa Adicional: ");
                float despesa = s.nextFloat();
                s.nextLine();
                f.add(new FuncionarioTerceirizado(nome, horas, valor, despesa)); 
            }else{
                f.add(new FuncionarioProprio(nome, horas, valor));
            }
        }
        
        for(Funcionario funcionario : f){
            System.out.println(funcionario.toString());
            System.out.println("");
        }
        s.close();
    }
}
