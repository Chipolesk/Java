package DebugCalculadora;


import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        String[] alunos = {"daniel", "neymnmar", "somnic", "vascao"};

        double media = calcularMediaTurma(alunos, scanner);
        System.out.printf("media da turma %.1f", media);
    }

    public static double calcularMediaTurma(String [] alunos, Scanner scanner){
        double soma=0;
        try{
       
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
    }catch(Exception exception){

        System.err.println(exception.getMessage());
        System.out.println("Não é permitido letras");
    }
        return soma/alunos.length;
    }
}
