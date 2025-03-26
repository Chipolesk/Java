import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {
        System.out.println("DISCANDO. . .");
        do  {


            System.out.println("TELEFONE TOCANDO. . . TUUUUUUUUUUUUUUUUUUUUUUUUUUUU");


        }
        while (tocando());
        
        System.out.println("ALOU");
        
    }

    private static boolean tocando(){

        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? "+ atendeu);
        //cancela o ato de continuar tocando
        return ! atendeu;
    }
}
