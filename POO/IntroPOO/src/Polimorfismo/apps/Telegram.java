package Polimorfismo.apps;


public class Telegram extends ServicoMensagemInstantaneaP {


    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MSG PELO TELEGRAM");

    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MSG PELO TELEGRAM");

    }
}
