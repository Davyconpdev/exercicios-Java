package entidade;
public class ContaEspecial extends Conta{
   
    private double limiteEmprestimo;

    public ContaEspecial(int numero, String nome, double saldoInicial, double limiteEmprestimo) {
        super(numero, nome, saldoInicial);
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
    public double getLimiteEmprestimo(){
        return limiteEmprestimo;
    }
    public void setLimiteEmprestimo(double limiteEmprestimo){
        this.limiteEmprestimo = limiteEmprestimo;
    }
    
     public void Emprestimo(double valor){
        if(valor <= limiteEmprestimo){
            saldo += valor - 10.0;
        }else{
           this.getSaldo();  
        }
    }
     
     @Override
     public String toString(){
         return super.toString() +
        "Limite do Emprestimo: R$" +
        String.format("%.2f", limiteEmprestimo);    
     }
}
 