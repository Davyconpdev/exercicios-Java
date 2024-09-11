package entidade;

public class Conta {
    
    private int numConta;
    private String titular;
    double saldo;
 
    
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
    
    public String getTitular(){
        return titular;
    }
    
    public void setTitular(String nome){
        this.titular = nome;
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
        return "Conta: " + this.numConta
           + ".  Titular: " + this.titular
           + ".  Saldo: R$" + this.saldo
           + String.format("%.2f",saldo);
    }
}
    
    /*public Conta(int numero, String nome, double depInicial) {
    }
    public Conta(int numero, String nome) {
    }*/
   

   
    
   
  

