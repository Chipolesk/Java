package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno daniel =  new Aluno();
        daniel.setNome("Daniel Chipolesk");
        daniel.setIdade(17);
        daniel.setSexo("M");

        System.out.println("o aluno " + daniel.getNome() + " tem " + daniel.getIdade() + " anos de idade e é " + daniel.getSexo() );
    }
}
