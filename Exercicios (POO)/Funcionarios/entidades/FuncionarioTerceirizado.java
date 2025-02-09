package entidades;

public class FuncionarioTerceirizado extends Funcionario{
    
    protected float despesaAdd;

    public FuncionarioTerceirizado(String nome, float horas, float valor, float despesa) {
        super(nome,horas,valor);
        this.despesaAdd = despesa;
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
    
    protected void SetDespesa(float despesa){
        this.despesaAdd = despesa;
    }
    public float GetDespesa(){
        return this.despesaAdd;
    }
    
    @Override
    public float pagamento(){
        float bonus = (float) (this.GetDespesa() * 1.1);
      return this.GetHoras() * this.GetValor() + bonus;  
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
