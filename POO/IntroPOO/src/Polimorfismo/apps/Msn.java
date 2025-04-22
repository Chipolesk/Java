package Polimorfismo.apps;

public class Msn extends ServicoMensagemInstantaneaP {


    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MSG PELO MSN");
    }

    public void receberMensagem() {
        System.out.println("RECEBENDO MSG PELO MSN");

    }
}
