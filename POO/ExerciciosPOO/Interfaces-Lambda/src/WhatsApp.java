public interface WhatsApp {
    default void receberMensagemWpp(String mensagem){
        System.out.println("RECEBENDO A MENSAGEM PELO WPP\n" + mensagem);
    }
}
