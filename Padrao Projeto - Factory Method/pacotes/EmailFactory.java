package pacotes;
//SubclasseFábricaEmail para Notificações por Email. 
public class EmailFactory extends NotificacaoFactory {
    @Override
    public Notificacao criarNotificacao(String Mensagem){
        return new NotificacaoEmail(Mensagem);
    }
}
