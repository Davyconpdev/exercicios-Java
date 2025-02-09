package entidades;

public abstract class Funcionario {
    public String nome;
    protected float horasTrab;
    protected float valorHora;
    
    public Funcionario(String nome, float horas, float valor){
        this.nome = nome;
        this.horasTrab = horas;
        this.valorHora = valor;
    }
    
    public float pagamento(){
       return 0; 
    }
    
    public abstract String etiquetaPreco();
}
