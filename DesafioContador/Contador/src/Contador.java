import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("digite o primeiro parametro: ");
        int paramUm = scanner.nextInt();
        System.out.println("digite o segundo parametro: ");
        int paramDois = scanner.nextInt();
        try{

            contar(paramUm, paramDois);
        }catch (ParametrosInvalidosException exception){
            System.err.println("O segundo parametro deve ser maior que o primeiro");
        }

    }
    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
        if (paramUm > paramDois)
            throw new ParametrosInvalidosException();

        int contagem = paramDois - paramUm;

        for (int i=1; i <=contagem; i++)
            System.out.println("imprimindo o numero: " + i);
    }

}