package entidades;

public class FuncionarioProprio extends Funcionario{

    public FuncionarioProprio(String nome, float horas, float valor) {
        super(nome,horas,valor);
    }
     
    public void SetNome(String nome){
        this.nome = nome;
    }
    public String GetNome(){
        return this.nome;
    }
    
    protected void SetHoras(float horas){
        this.horasTrab = horas;
    }
    public float GetHoras(){
        return this.horasTrab;
    }
    
    protected void SetValor(float valor){
        this.valorHora = valor;
    }
    public float GetValor(){
        return this.valorHora;
    }
    
    @Override
    public float pagamento(){
      return this.GetHoras() * this.GetValor();  
    }
    
    @Override
    public String toString(){
        return "\nNome: " + this.GetNome()+
               "\nPagamento: R$" + String.format("%.2f ",this.pagamento());
    }

    @Override
    public String etiquetaPreco() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
