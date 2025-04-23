package Heranca;

public class ServicoMensagemInstantanea {
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("ENVIANDO MENSAGEM");
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem");
    }
    private void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTA CONECTADO A INTERNET");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("SALVANDO HISTÓRICO DE MENSAGEM");
    }
}
