package Polimorfismo;

import Polimorfismo.apps.Facebook;
import Polimorfismo.apps.Msn;
import Polimorfismo.apps.ServicoMensagemInstantaneaP;
import Polimorfismo.apps.Telegram;

public class ComputadorPessoa {
    public static void main(String[] args) {
    ServicoMensagemInstantaneaP smi = null;
    //não sabe qual app será escolhido
        //mas qualquer um deverá enviar e receber mensagem

        String appEscolhido = "tlg";

        if (appEscolhido.equals("msn"))
            smi = new Msn();
        else if (appEscolhido.equals("fb"))
            smi = new Facebook();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();


    }
}
