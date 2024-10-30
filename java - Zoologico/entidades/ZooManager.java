package entidades;

import java.util.List;
import java.util.ArrayList;

public class ZooManager {
    
    protected List<Animal> animais;
    
    public ZooManager(){
        this.animais = new ArrayList<>();
    }
    
    public void AddAnimal(Animal animal){
        animais.add(animal);
    }
    
    public void ListarAnimais(){
        if(animais.isEmpty()){
            System.out.println("Nenhum animal registrado.");
        }else{
            for(Animal animal : animais){
               System.out.println("\n"+animal.GetNome()+" - "+animal.GetTipo());
            }
        }
    }
    
    public void EmitirSomAnimais(){
        if(animais.isEmpty()){
            System.out.println("Nenhum animal registrado para emitir som.");
        }else{
            for(Animal animal : animais){
               animal.EmitirSom();
            }
        }
    }
}
