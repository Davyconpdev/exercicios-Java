package pacotes;
//SubclasseFábricaSMS para Notificações por SMS.
public class SMSFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao(String Mensagem){
        return new NotificacaoSMS(Mensagem);
    }
}
