package lanchonete.atendimento;

public class Atendente {
    public void servirMesa(){
        pegarLancheCozinha();
        System.out.println("SERVINDO MESA");
    }
    void pegarLancheCozinha(){
        System.out.println("pegando lanche na cozinha");
    }
    public void receberPagamento(){
        System.out.println("RECEBENDO PAGAMENTO");
    }
    void trocarGas(){
        System.out.println("ATENDENTE TROCANDO GAS");
    }
    public void pegarPedidoBalcao(){
        System.out.println("PEGANDO PEDIDO NO BALCAO");
    }
}
