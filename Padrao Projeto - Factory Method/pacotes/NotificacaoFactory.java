package pacotes;
//Classe Abstrata da Fábrica ou Interface.
public abstract class NotificacaoFactory {
    public abstract Notificacao criarNotificacao(String Mensagem);
}
