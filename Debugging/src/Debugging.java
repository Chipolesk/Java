//PILHA DE EXECUÇÃO
public class Debugging {
    public static void main(String[] args) throws Exception {
        System.out.println("INICIOU O METODO MAIN!");
        a();
        System.out.println("FINALIZOU O METODO MAIN");

    }

    static void a(){
         System.out.println("INICIOU O METODO A!");
        b();
        System.out.println("FINALIZOU O METODO A");


    }
    static void b(){
        System.out.println("INICIOU O METODO B!");
        for(int i=0; i <=4; i++)
        System.out.println(i);
       c();
       System.out.println("FINALIZOU O METODO B");
    
   }
    static void c(){
        System.out.println("INICIOU O METODO C!");
       //Thread.dumpStack();
       System.out.println("FINALIZOU O METODO C");
    
   }

}
