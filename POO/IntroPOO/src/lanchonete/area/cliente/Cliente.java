package lanchonete.area.cliente;

public class Cliente {
    public void escolherLanche(){
        System.out.println("ESCOLHENDO O LANCHE");
    }
    public void fazerPedido(){
        escolherLanche();
        System.out.println("FAZENDO PEDIDO");
    }
    public void pagarConta(){
        consultarSaldoApp();
        System.out.println("PAGANDO A CONTA");
    }
    private void consultarSaldoApp(){
        System.out.println("CONSULTANDO MEU SALDO");
    }
}
