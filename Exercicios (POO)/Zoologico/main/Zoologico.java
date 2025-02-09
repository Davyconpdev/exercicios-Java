
package com.mycompany.zoologico;

import java.util.Scanner;
import entidades.Animal;
import entidades.Leao;
import entidades.Elefante;
import entidades.Papagaio;
import entidades.ZooManager;
import java.util.List;
import java.util.ArrayList;
        
public class Zoologico {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ZooManager zm = new ZooManager();
          
        while(true) {
            System.out.println("\n");
            System.out.println("1. Registrar Animal");
            System.out.println("2. Listar todos os Animais");
            System.out.println("3. Emitir o som dos Animais");
            System.out.println("4. Sair");
            System.out.print("Escolha um numero: ");
            int opcao = s.nextInt();
            s.nextLine();
        
            switch(opcao){
                case 1:
                    System.out.print("Registrar quantos Animais?: ");
                    int n = s.nextInt();
                    s.nextLine();
                
                    for(int i = 1; i <= n; i++) {
                        System.out.print("Nome do Animal: ");
                        String nome = s.nextLine();  
            
                        System.out.print("Especie: ");
                        String tipo = s.nextLine();
                    
                        Animal animal;/
                        switch(tipo.toLowerCase()){
                            case "leao":
                                animal = new Leao(nome);
                                zm.AddAnimal(animal);
            
                            case "elefante":
                                animal = new Elefante(nome);
                                zm.AddAnimal(animal);
                            case "papagaio":
                                animal = new Papagaio(nome);
                                zm.AddAnimal(animal);
                            default:
                                continue;
                        } 
                    }
                        System.out.println("\nOs Animais foram registrados com sucesso.");
                        break;

                case 2:
                    zm.ListarAnimais();
                    break;
                
                case 3:
                    zm.EmitirSomAnimais();
                    break;
                
                case 4:
                    System.out.print("Encerrando o Programa..."); 
                    s.close();
                    return;
               
                default:
                    System.out.print("Opcao Invalida.");
            }
        }        
    }
}

