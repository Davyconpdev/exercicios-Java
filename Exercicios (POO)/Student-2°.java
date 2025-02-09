package com.mycompany.studentnota;

import java.util.Scanner;

public class Student {

    String nome;
    Integer nota;
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Double soma = 0.0;
        
        System.out.println("Insira sua %d nota: ");
        String nome = s.next();
        
        for(int i = 0; i < 3; i++){ 
            
          System.out.println("Insira sua %d nota: ");
          Integer nota = s.nextInt();
        
          soma += i;
        
          System.out.println(i);
        }
        
        if(soma >= 60){
            System.out.printf("A nota final do aluno(a) %s é: %f.2", nome, soma);
            System.out.println("Aprovado!");
        } else { 
            Double resto = 60.0 - soma;
            System.out.printf("A nota final do aluno(a) %s é: %f.2", nome, soma);
            System.out.println("Reprovado. !");
            System.out.printf("Diferença necessaria para aprovar: %f.2", resto);
        }
    }
}
