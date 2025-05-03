package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }



    public void adicionarNumero(int numero){
        numeros.add(numero);
    }
    public int calculaSoma() {
        int soma = 0;
        for (Integer sm : numeros) {
            soma += sm;
        }
            return  soma;
    }
    public int encontrarMaiorNumero(){
        int maiorNumero=0;
        for (Integer numero : numeros){
            if (numero > maiorNumero)
                maiorNumero = numero;
        }
        return maiorNumero;
    }
    public int encontrarMenorNumero(){
        int menorNumero = 50;
        for (Integer numero : numeros){
            if (numero < menorNumero)
                menorNumero = numero;
        }
        return menorNumero;
    }
    public void exibirNumeros(){
        System.out.println(numeros);
    }

    @Override
    public String toString() {
        return "SomaNumeros{" +
                "numeros=" + numeros +
                '}';
    }

    public static void main(String[] args) {
        SomaNumeros somas = new SomaNumeros();
        somas.adicionarNumero(10);
        somas.adicionarNumero(100);
        somas.adicionarNumero(20);
        System.out.println(somas.calculaSoma());
        System.out.println(somas.encontrarMaiorNumero());
        System.out.println( somas.encontrarMenorNumero());
        somas.exibirNumeros();
    }
}
