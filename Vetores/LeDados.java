import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * LeDados
 */

public class LeDados {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // BufferedReader = buffer de leituracle
        // InputStreamReader = captura um fluxo de entrada de dados
        // System.in = entrad padrao (teclado)

        String linha = "";
        System.out.println("Digite alguma coisa ou S para sair");

        while (!linha.toUpperCase().equals("S")) {

            linha = reader.readLine();
            System.out.println("Digitou " + linha);
        }

    }

}
