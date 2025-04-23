package org.ContaBancaria.model;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MenuApp extends AppBanco{

    public static void main(String[] args) {
        int menu = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("BEM-VINDO AO NOSSO BANCO\n");
        System.out.println("PRIMEIRO VAMOS CRIAR SUA CONTA");


        System.out.println("DIGITE QUANTO VOCE QUER FAZER COMO PRIMEIRO DEPOSITO:");
        double primeiroDeposito = scanner.nextDouble();
        AppBanco itau = new AppBanco(primeiroDeposito);
        System.out.println("CONTA CRIADA COM SUCESSO\n");

        while (menu != 7) {
            System.out.println("DIGITE UMA OPÇÃO QUE DESEJA FAZER");
            System.out.println(" 1 - CONSULTAR SALDO");
            System.out.println(" 2 - CONSULTAR CHEQUE ESPECIAL");
            System.out.println(" 3 - DEPOSITAR DINHEIRO");
            System.out.println(" 4 - SACAR DINHEIRO");
            System.out.println(" 5 - PAGAR BOLETO");
            System.out.println(" 6 - VERIFICAR SE ESTÁ USANDO UM CHEQUE ESPECIAL");
            System.out.println(" 7 - SAIR");
            menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("SALDO ATUAL: " + itau.consultarSaldo());
                    break;

                case 2:
                    System.out.println("CHEQUE ESPECIAL DISPONIVEL: " + itau.consultarChequeEspecial());
                    break;

                case 3:
                    System.out.println("DIGITE UM VALOR QUE DESEJA DEPOSITAR");
                    double valorDeposito = scanner.nextDouble();
                    itau.depositarDinheiro(valorDeposito);
                    System.out.println("DEPOSITO REALIZADO COM SUCESSO");
                    break;

                case 4:
                    System.out.println("DIGITE UM VALOR QUE DESEJA SACAR");
                    double valorSaque = scanner.nextDouble();
                    itau.sacarDinheiro(valorSaque);
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("DIGITE O NOME DO BOLETO QUE DESEJA PAGAR: ");
                    String nomeBoleto = scanner.nextLine();

                    System.out.println("DIGITE O VALOR DELE:");
                    double valorBoleto = scanner.nextDouble();

                    itau.pagarBoleto(nomeBoleto, valorBoleto);
                    break;

                case 6:
                    itau.verificarUsandoChequeEspecial();
            }
        }
        scanner.close();
    }
}