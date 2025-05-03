import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Conta implements InterfaceConta {
    private static int AGENCIA_PADRAO = 1;
    private static int NUMERO_CONTADOR = 1;
    private List<Cliente> clienteList = new ArrayList<>();

    protected Cliente cliente;
    protected int agencia = AGENCIA_PADRAO;
    protected int numeroConta = NUMERO_CONTADOR++;
    protected double saldo = 0d;

    //Construtor desta classe e também referencia a classe Cliente
    public Conta(Cliente cliente) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.cliente = cliente;
    }

    //Construtor do ArrayList
    public Conta(){ this.clienteList = new ArrayList<>(); }

    public void adicionarCliente(Cliente nomeCliente){
        Cliente clientes = new Cliente(String.valueOf(nomeCliente));
        this.clienteList.add(clientes);
    }
    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, InterfaceConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

@Override
    public void imprimirExtratoComum() {
        System.out.println("\nTITULAR: " + this.cliente.getNome());
        System.out.println("AGENCIA: " + this.getAgencia());
        System.out.println("CONTA:" + this.getNumeroConta());
        System.out.println("SALDO: R$ " + this.getSaldo());
    }
}
