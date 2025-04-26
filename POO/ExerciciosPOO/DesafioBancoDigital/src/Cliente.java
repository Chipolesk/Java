import javax.management.ConstructorParameters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {

    private String nome;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente(String nomeCliente) {
        this.nome = String.valueOf(nomeCliente);
    }
}
