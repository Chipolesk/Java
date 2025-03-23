import java.util.Scanner;

public class ContaTerminal {

   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
       
        System.out.println("POR FAVOR, DIGITE O NÚMERO DA CONTA");
        int numeroConta = scanner.nextInt();

        System.out.println("POR FAVOR, DIGITE O NÚMERO DA AGÊNCIA:");
        String numeroAgencia = scanner.next();

        System.out.println("POR FAVOR, DIGITE O SEU NOME:");
        String nomeCliente = scanner.next();

        System.out.println("POR FAVOR, DIGITE O SALDO:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + 
        ", conta " + numeroConta + " e o seu saldo " + saldo + " já está disponível para saque");
    }
}
