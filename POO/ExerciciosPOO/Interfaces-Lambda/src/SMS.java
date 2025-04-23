public interface SMS {
    default void receberMensagemSMS(String mensagem){
        System.out.println("RECEBENDO A MENSAGEM PELO SMS\n" + mensagem);
    }
}
