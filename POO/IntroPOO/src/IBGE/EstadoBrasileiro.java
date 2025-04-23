package IBGE;

public enum EstadoBrasileiro {
    RIO_DE_JANEIRO("RJ", "RIO DE JANEIRO"),
    SAO_PAULO("SP", "SAO PAULO"),
    PIAUI("PI", "PIAUI"),
    NEYMAR("NJ", "NEYMAR JR");

    private String nome;
    private String sigla;

    private EstadoBrasileiro(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }
    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
