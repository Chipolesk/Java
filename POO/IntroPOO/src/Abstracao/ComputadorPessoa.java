package Abstracao;

public class ComputadorPessoa {
    public static void main(String[] args) {

        Facebook facebook = new Facebook();
        System.out.println("facebook aberto");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        Telegram telegram = new Telegram();
        System.out.println("telegram aberto");
        telegram.enviarMensagem();
        telegram.receberMensagem();

        Msn msnMensager = new Msn();
        System.out.println("msn aberto");
        msnMensager.enviarMensagem();
        msnMensager.receberMensagem();
    }
}
