public class ContinueBreak {
 public static void main(String[] args) {
    System.out.println("ESTE É UM CÓDIGO PARA IMPRIMIR APENAS NUMEROS IMPARES DE 1 ATÉ 10");
    for(int i = 1; i<=30;i++){
        if(i % 2 != 0)
        continue;
        //CONTINUE TEM A MESMA FUNÇÃO QUE O 'PASS' DO PYTHON. QUE TEM A FUNÇÃO DE PULAR TAL EXECUÇÃO
        //NESTE CÓDIGO, NO CASO, ELE IRÁ PULAR TODOS OS NÚMEROS QUE O RESTO DELE É DIFERENTE DE 0 (NUMEROS IMPARES)
        System.out.println(i);
    }
 }   
}
