package pacotes;
//Implementação da Notificação por SMS.
public class NotificacaoSMS extends Notificacao{
    
    public NotificacaoSMS(String mensagem) {
        super(mensagem); 
    }
    @Override
    public void enviar() {
        System.out.println("Enviando SMS: " + mensagem);
    }
}