package Polimorfismo.apps;

public abstract class ServicoMensagemInstantaneaP {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //PROTECTED EXIBE APENAS PARA CLASSES FILHAS, TRAZENDO EXCLUSIVIDADE QUE O PRIVATE NAO CONSEGUE
    protected void validarConectadoInternet(){
        System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET");
    }

}
