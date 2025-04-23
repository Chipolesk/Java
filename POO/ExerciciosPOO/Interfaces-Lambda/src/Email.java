public interface Email {
    default void receberMensagemEmail(String mensagem){
        System.out.println("RECEBENDO A MENSAGEM PELO EMAIL\n" + mensagem);
    }
}
