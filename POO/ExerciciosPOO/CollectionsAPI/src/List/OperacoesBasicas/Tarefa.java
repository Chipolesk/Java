package List.OperacoesBasicas;



public class Tarefa {
    private  String descricao;

    //constructor
    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
