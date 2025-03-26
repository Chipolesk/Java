public class ExemploExcecao {
    public static void main(String[] args) {
        String cpfFormatado;
        try {
            cpfFormatado = formatarCPF("1968848743");
            System.out.println(cpfFormatado);
        } catch (CpfInvalidoException e) {
            // TODO Auto-generated catch block
            System.err.println("CPF INVALIDO " + e);
        }

    }

    static String formatarCPF(String cpf) throws CpfInvalidoException {
        if (cpf.length() != 11)
            throw new CpfInvalidoException();

        return "196.888.487-43";
    }
}
