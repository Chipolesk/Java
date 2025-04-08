public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo:");

        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
    }
    public static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        String resposta = salarioBase > salarioPretendido ? "LIGAR PARA O CANDIDATO" 
        : salarioBase == salarioPretendido ? "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA" 
        : "AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS";

        System.out.println(resposta);
    }
}
