
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public static void main(String[] args) {
    AparelhoTelefonico ligacoes = new Iphone();
    NavegadorInternet safari = new Iphone();
    ReprodutorMusical iMusic = new Iphone();

        System.out.println("ENTRANDO NO APP DE LIGAÇÕES");
    ligacoes.ligar("21970275007");
    ligacoes.atender();
    ligacoes.iniciarCorreioVoz();
        System.out.println("\nENTRANDO NA INTERNET");
    safari.exibirPagina("WWW.DANIELCHIPOLESK.COM.BR");
    safari.atualizarPagina();
    safari.adicionarNovaAba();
        System.out.println("\nABRINDO REPRODUTOR MUSICAL");
    iMusic.selecionarMusica("UMA VEZ - FHOP");
    iMusic.tocar();
    iMusic.pausar();



    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA " + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PAGINA");
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA " + musica);
    }
}