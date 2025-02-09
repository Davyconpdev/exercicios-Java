package pacotes;
//Classe Abstrata de Notificação.
public abstract class Notificacao {
    
    protected String mensagem;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }
    
    public abstract void enviar();
}
