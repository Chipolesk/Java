package br.org.danielchipolesk;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.org.danielchipolesk.model.Board;
import br.org.danielchipolesk.model.Space;

import static br.org.danielchipolesk.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);

    private static Board board;

    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        final var positions = Stream.of(args)
                .collect(Collectors.toMap(
                        k -> k.split(";")[0],
                        v -> v.split(";")[1]
                ));
        var option = -1;

        while (true) {
            System.out.println("Selecione uma das opções a seguir");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");

            option = scanner.nextInt();

            switch (option) {
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> System.exit(0);
                default -> {
                    System.out.println("OPÇÃO INVALIDA, SELECIONE UMA DAS OPCOE DO MENU");
                    break;
                }

            }
        }

    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)){
            System.out.println("O JOGO JA FOI INICIADO");
            return;
        }
        List<List<Space>> spaces = new ArrayList<>();
        for(int i=0; i< BOARD_LIMIT; i++){
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++){
                var positionsConfig = positions.get("%s,%s".formatted(i,j));
                var expected = Integer.parseInt(positionsConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionsConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        board = new Board(spaces);
        System.out.println("O JOGO ESTÁ PRONTO PARA COMEÇAR");
    }

    private static void inputNumber() {
        if (isNull(board)){
            System.out.println("O JOGO AINDA NAO FOI INICIADO");
            return;
        }
        System.out.println("informe a coluna em que deseja inserir o numero");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("informe a linha em que deseja inserir o numero");
        var row = runUntilGetValidNumber(0,8);
        System.out.printf("INFORME O NUMERO QUE VAI ENTRAR NA POSICAO [%s , %s]\n", col, row);
        var value = runUntilGetValidNumber(1,9);

        if (!board.changeValue(col,row,value)){
            System.out.printf("A POSICAO [%s,%s] TEM UM VALOR FIXO\n", col,row);
        }
    }

    private static void removeNumber() {
        if (isNull(board)){
            System.out.println("O JOGO AINDA NAO FOI INICIADO");
            return;
        }
        System.out.println("informe a coluna em que deseja remover o numero");
        var col = runUntilGetValidNumber(0,8);
        System.out.println("informe a linha em que deseja remover o numero");
        var row = runUntilGetValidNumber(0,8);
        System.out.printf("INFORME O NUMERO QUE VAI SAIR DA POSICAO [%s , %s]\n", col, row);
        var value = runUntilGetValidNumber(1,9);

        if (!board.clearValue(col,row)){
            System.out.printf("A POSICAO [%s,%s] TEM UM VALOR FIXO\n", col,row);
        }
    }
    private static void showCurrentGame() {
        if (isNull(board)){
            System.out.println("o jogo ainda nao foi iniciado");
            return;
        }
        var args = new Object[81];
        var argPos = 0;
        for (int i =0; i< BOARD_LIMIT; i++){
            for (var col: board.getSpaces()){
                args[argPos++] = " " + ((isNull(col.get(i).getActual()) ? " " : col.get(i).getActual()));
            }
        }
        System.out.println("SEU JOGO SE ENCONTRA DA SEGUINTE FORMA:");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if (isNull(board)){
            System.out.println("o jogo ainda nao foi iniciado");
            return;
        }
        System.out.printf("O JOGO ATUALMENTE SE ENCONTRA NO STATUS %s\n", board.getStatus().getLabel());
        if (board.hasErrors()){
            System.out.println("O JOGO CONTEM ERROS");
        }else {
        System.out.println("O JOGO NAO CONTEM ERROS");
        }
    }

    private static void clearGame() {
        if (isNull(board)){
            System.out.println("o jogo ainda nao foi iniciado");
            return;
        }
        System.out.println("TEM CERTEZA QUE DESEJA LIMPAR SEU JOGO E PERDER TODO O SEU PROGRESSO?");
        var confirm = scanner.next();
        while (!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")){
            System.out.println("INFORME 'sim' OU 'não'");
            confirm = scanner.next();
        }
        if (confirm.equalsIgnoreCase("sim")){
            board.reset();
        }
    }

    private static void finishGame() {
        if (isNull(board)){
            System.out.println("o jogo ainda nao foi iniciado");
            return;
        }
        if (board.gameIsFinished()){
        System.out.println("PARABENS, VOCE CONCLUIU O JOGO");
        showCurrentGame();
        board = null;
        } else if (board.hasErrors()){
            System.out.println("O SEU JOGO CONTEM ERROS, VERIFIQUE SEU BOARD E AJUSTE-O");
        }else {
            System.out.println("VOCE AINDA PRECISA PREENCHER ALGUM ESPAÇO");
        }
    }


    private static int runUntilGetValidNumber(final int min, final int max){
        var current = scanner.nextInt();
        while (current < min || current > max){
            System.out.printf("INFORME UM NUMERO ENTRE %s e %s\n", min, max);
            current = scanner.nextInt();
        }
        return current;
    }
}