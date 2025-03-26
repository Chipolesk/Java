import java.util.concurrent.ThreadLocalRandom;

public class While {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            
            //se o valor do doce for maior do que ele tem disponivel para gastar, [...]
            //[...] o programa irá fazer com que o valor do doce seja igual ao valor disponivel. Fazendo com que ele zere sua mesada
              if (valorDoce > mesada)
              
                valorDoce = mesada;
             
            System.out.println("doce do valor: R$" + valorDoce + " adicionado no carrinho");
            mesada -= valorDoce;

        }
        System.out.println("mesada: " + mesada);
        System.out.println("eu gastei tudo em doces");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 12);
    }
}
