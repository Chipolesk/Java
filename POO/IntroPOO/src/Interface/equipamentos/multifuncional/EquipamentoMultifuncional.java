package Interface.equipamentos.multifuncional;

import Interface.equipamentos.copiadora.Copiadora;
import Interface.equipamentos.digitalizadora.Digitalizadora;
import Interface.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    //LEMBRANDO QUE NAO É SOBRE INTERFACE GRÁFICA,
    // A INTERFACE É IGUAL À ABSTRACAO, POREM MULTIFUNCIONAL, PODENDO UMA CLASSE TER REFERENCIAS DE VARIAS OUTRAS
    @Override
    public void copiar() {
        System.out.println("COPIANDO VIA MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA MULTIFUNCIONAL");

    }

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO VIA MULTIFUNCIONAL");

    }
}
