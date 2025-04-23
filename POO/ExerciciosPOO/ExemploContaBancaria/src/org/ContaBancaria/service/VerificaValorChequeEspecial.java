package org.ContaBancaria.service;
public class VerificaValorChequeEspecial {
    public static double calcularLimite(double primeiroDeposito){
        if (primeiroDeposito <= 500.0)
            return 50.0;
        else{
            return primeiroDeposito * 0.5;
        }


    }


}


