
public class Banco{
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("cliente1");
        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.adicionarCliente(cliente1);

        Cliente cliente2 = new Cliente("cliente2");
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente2);
        contaPoupanca.adicionarCliente(cliente2);

        contaCorrente.depositar(1000);
        contaCorrente.transferir(550, contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}