package SistemaCadastroPessoa;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String cpf, String nome){
        this.nome = nome;
        this.cpf = cpf;
    }
    //É NECESSÁRIO SEMPRE CRIAR O GET.. O SET NÃO! USA-SE O CONSTRUTOR DANDO O VALOR DIRETO PELA CLASSE.
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}
