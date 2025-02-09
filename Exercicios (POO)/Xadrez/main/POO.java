package teste;

import xadrez.Peao;
import xadrez.Bispo;
import xadrez.Cavalo;

public class POO {
    
 public static void main(String[] args) {
    System.out.println("Hello World!");
    
    Peao pa = new Peao();
    Bispo bp = new Bispo();
    Cavalo cv = new Cavalo();
    
    
    pa.mover();
    bp.mover();
    cv.mover(); 
  
    }
}
