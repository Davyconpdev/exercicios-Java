package com.mycompany.biblioteca;

import entidades.ItemBiblioteca;
import entidades.Livro;
import entidades.Revista;
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ItemBiblioteca item;
        
        System.out.print("Titulo da Literatura: ");
        String titulo = s.nextLine();
        
        System.out.print("Codigo da Literatura: ");
        int codigo = s.nextInt();
        s.nextLine();
        
        System.out.print("É Livro ou Revista?(l/L ou r/R): ");
        char tipo = s.next().charAt(0);
        s.nextLine();
    
        if(tipo == 'l' || tipo == 'L'){
           
            System.out.print("Autor: ");
            String autor = s.nextLine();
            
            System.out.print("Quantidade de Paginas: ");
            int paginas = s.nextInt();
            item = new Livro(titulo, codigo, autor, paginas);
        
        }else{
            
            System.out.print("Mes da Publicacao: ");
            String mesPublic = s.nextLine();
            
            System.out.print("Edicao: ");
            int edicao = s.nextInt();
            item = new Revista(titulo, codigo, mesPublic, edicao);
        } 
        item.ExibirInfoBasica();
        System.out.println(item.exibirDetalhes());
    }
}
