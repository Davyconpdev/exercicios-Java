package pacotes;
//Implementação da Notificação por Email.
public class NotificacaoEmail extends Notificacao{
    
    public NotificacaoEmail(String mensagem){
        super(mensagem);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando Email: " + mensagem);
    }
}
