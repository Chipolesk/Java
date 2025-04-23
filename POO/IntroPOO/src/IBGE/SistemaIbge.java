package IBGE;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estadoBrasileiro: EstadoBrasileiro.values()){
            System.out.println(estadoBrasileiro.getNome() + " - " + estadoBrasileiro.getSigla());
        }
    }
}
