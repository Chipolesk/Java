package SistemaCadastroPessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa daniel = new Pessoa("196", "DANIEL CHAMPS");

        daniel.setEndereco("TRAVESSA C");

        System.out.println(daniel.getNome() + " - " + daniel.getCpf() + " / " + daniel.getEndereco());
    }
}

