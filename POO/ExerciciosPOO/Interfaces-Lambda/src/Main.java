//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Smartphone {
    public static void main(String[] args) {
    Smartphone celular = new Smartphone();
   String mensagem = celular.enviarMensagem();
        System.out.println("============");
    celular.receberMensagemEmail(mensagem);
        System.out.println("============");
    celular.receberMensagemSMS(mensagem);
        System.out.println("============");
    celular.receberMensagemWpp(mensagem);
        System.out.println("============");
    celular.receberMensagemRede(mensagem);

    }

}