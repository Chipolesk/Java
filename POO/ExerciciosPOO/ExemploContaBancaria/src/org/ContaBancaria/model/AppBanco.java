package org.ContaBancaria.model;

import org.ContaBancaria.service.VerificaValorChequeEspecial;

public class AppBanco {
    public double primeiroDeposito;
    public double chequeEspecial = 0.0;
    public double saldoAtual;
    private double limiteChequeEspecial = 0.0;
    public boolean usandoChequeEspecial = false;
    private double valorChequeUsado = 0.0;

    public AppBanco(double primeiroDeposito){
    this.primeiroDeposito = primeiroDeposito;
    this.saldoAtual = primeiroDeposito;

    this.limiteChequeEspecial = VerificaValorChequeEspecial.calcularLimite(primeiroDeposito);
    this.chequeEspecial = this.limiteChequeEspecial;
    this.saldoAtual += chequeEspecial;
    }
    public AppBanco(){

    }
    public void pagarBoleto(String nomeBoleto, double valorBoleto){
        System.out.println("BOLETO: " + nomeBoleto + "VALOR: R$" + valorBoleto);
        if (valorBoleto <= saldoAtual){
            saldoAtual -= valorBoleto;
            System.out.println("BOLETO PAGO COM SUCESSO\nNOVO SALDO: R$" + saldoAtual);
        }
        else if (valorBoleto <= saldoAtual + chequeEspecial){
            double restante = valorBoleto - saldoAtual;
            saldoAtual = 0;
            chequeEspecial -= restante;
            valorChequeUsado += restante;
            System.out.println("VALOR PAGO COM CHEQUE ESPECIAL\nCHEQUE ESPECIAL RESTANTE: R$ " + chequeEspecial);
        }
        else {
            System.out.println("SALDO INSUFICIENTE PARA PAGAR O BOLETO");
        }

    }

    public double consultarSaldo(){

        return saldoAtual;
    }
    public double consultarChequeEspecial(){

        return chequeEspecial;
    }
    public void depositarDinheiro(double valorDepositado){
        System.out.println("DEPOSITANDO: " + valorDepositado);
        saldoAtual += valorDepositado;

        if(valorChequeUsado > 0){
            double taxa = valorChequeUsado * 0.20;
            if (saldoAtual >= taxa){
                saldoAtual -= taxa;
                System.out.println("TAXA DE 20% SOBRE O USO TOTAL DO CHEQUE ESPECIAL: R$ " + taxa);
                valorChequeUsado = 0;

            }

        }
        System.out.println("SALDO ATUAL É DE: " + saldoAtual);
    }
    public void sacarDinheiro(double valorSacado){
        if (valorSacado <= saldoAtual) {
            saldoAtual -= valorSacado;
            System.out.println("VALOR SACADO COM SUCESSO, SEU NOVO SALDO É: " + saldoAtual);
        } else if (valorSacado <= saldoAtual + chequeEspecial) {
            double restante = valorSacado - saldoAtual;
            saldoAtual = 0;
            chequeEspecial -= restante;
            valorChequeUsado += restante;
            usandoChequeEspecial = true;
            System.out.println("VALOR SACADO COM SUCESSO UTILIZANDO O CHEQUE ESPECIAL.\nSEU SALDO ESTÁ ZERADO!");
            System.out.println("CHEQUE ESPECIAL RESTANTE: " + chequeEspecial);
        }else {

            System.out.println("SALDO NEGATIVADO");
        }
    }
    public void verificarUsandoChequeEspecial(){
        System.out.println("ESTOU USANDO CHEQUE ESPECIAL? " + usandoChequeEspecial);
    }




}
