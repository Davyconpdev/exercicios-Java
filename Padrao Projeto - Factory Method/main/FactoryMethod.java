package com.mycompany.padraoprojeto;

import pacotes.EmailFactory;
import pacotes.Notificacao;
import pacotes.NotificacaoFactory;
import pacotes.PushFactory;
import pacotes.SMSFactory;

//Classe Principal ou Client
public class FactoryMethod {
    public static void main(String[] args) {
        NotificacaoFactory smsFactory = new SMSFactory();
        Notificacao sms = smsFactory.criarNotificacao("Olá, isso é um SMS!");
        sms.enviar();
        
        NotificacaoFactory emailFactory = new EmailFactory();
        Notificacao email = emailFactory.criarNotificacao("Olá, isso é um Email!");
        email.enviar();
        
        NotificacaoFactory pushFactory = new PushFactory();
        Notificacao push = pushFactory.criarNotificacao("Olá, isso é um Push!");
        push.enviar();
      
    }
}
