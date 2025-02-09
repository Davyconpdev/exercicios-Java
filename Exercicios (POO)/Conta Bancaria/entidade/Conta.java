package entidade;

public class Conta {
    
    private int numConta;
    private String titular;
    float saldo;
 
    
    public Conta(int numero, String nome){
        this.numConta = numero;
        this.titular = nome;
    } 
    
    public Conta(int numero, String nome, double depInicial){
        this.numConta = numero;
        this.titular = nome;
        Depositar(depInicial);
    }
    
    public int getNumeroConta(){
        return numConta;
    }
   
    public void setTitular(String nome){
        this.titular = nome;
    }
    public String getTitular(){
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }
    
    public final void Depositar(double valor){
        saldo += valor;
    }
    
    public void Sacar(double valor){
        saldo -= valor + 5.0;
    }
    
    @Override
    public String toString(){
        return "\nNumero da Conta: " + this.numConta+ 
              ".\nTitular: " + this.titular+ 
              ".\nSaldo: R$" + String.format("%.2f ",saldo);
    }
}


   
    
   
  

