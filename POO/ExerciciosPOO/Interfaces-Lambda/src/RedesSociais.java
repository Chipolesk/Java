public interface RedesSociais  {
    default void receberMensagemRede(String mensagem){
        System.out.println("RECEBENDO A MENSAGEM PELA REDE\n" + mensagem);
    }


}
