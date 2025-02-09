package pacotes;
//SubclasseFábricaPush para Notificações por Push.
public class PushFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao(String Mensagem){
        return new NotificacaoPush(Mensagem);
    }
}
