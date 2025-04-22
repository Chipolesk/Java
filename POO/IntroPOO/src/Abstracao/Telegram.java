package Abstracao;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");

    }

}
