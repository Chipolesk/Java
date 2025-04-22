package Polimorfismo.apps;



public class Facebook extends ServicoMensagemInstantaneaP {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("ENVIANDO MSG PELO FACE");

    }
    public void receberMensagem() {
        System.out.println("RECEBENDO MSG PELO FACE");

    }

}
