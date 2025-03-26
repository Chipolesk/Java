import java.util.Scanner;

public class ResultadoEscolar {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        double notaAluno = 0.0;

        System.out.println("Digite seu nome!");
        String nomeAluno = scanner.nextLine();

        System.out.println("olá, " + nomeAluno + " digite sua nota:");

     
        while(!scanner.hasNextDouble()){
      
         
           System.out.println("POR FAVOR, DIGITE UM NUMERO");
           scanner.next();
       
        }

        notaAluno = scanner.nextDouble();
        String resultado = notaAluno >=7 ? "APROVADO" : notaAluno >4.5 && notaAluno <7 ? "RECUPERAÇÃO" : "REPROVADO";

        System.out.println(resultado);
         
      
       
         
    }

}

