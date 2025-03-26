import java.util.Locale;
import java.util.Scanner;

public class TryCatch {

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) throws Exception {
        String meuNome = "";
        int minhaIdade = 0;
        double minhaAltura = 0.0;
        try {

            System.out.println("nome");
            meuNome = scanner.nextLine();

            System.out.println("idade");
            minhaIdade = scanner.nextInt();

            System.out.println("altura");
            minhaAltura = scanner.nextDouble();

            System.out.println("meu chamo: " + meuNome + "tenho " + minhaIdade + " anos e tenho " + minhaAltura + "m");
            scanner.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("OS CAMPOS ESTAP ERRADOS");
        }
    }
}
