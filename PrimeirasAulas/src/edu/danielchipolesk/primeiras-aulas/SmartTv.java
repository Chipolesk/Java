
public class SmartTv {

      public boolean ligada = false;
       public int canal = 1;
       public int volume = 15;

    public void ligar(){
        ligada = true;
    }
    public void mudarCanal(){
        canal +=1;
    }
    public void aumentarVolume(){
        volume +=1;
    }

}
