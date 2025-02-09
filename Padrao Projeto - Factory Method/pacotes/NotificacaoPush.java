package pacotes;
//Implementação da Notificação por Push.
public class NotificacaoPush extends Notificacao{

    public NotificacaoPush(String mensagem){
        super(mensagem);
    }
    @Override
    public void enviar() {
        System.out.println("Enviando Push: " + mensagem);
    }    
}
