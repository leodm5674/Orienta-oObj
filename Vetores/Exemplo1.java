import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        // declara um vertor de int ja atribuindo os valores
        int vetValores[] = { 2, 5, 7, 3, 1, 8, 0 };
        System.out.println("vetorValores[0]" + vetValores[0]);

        // declara um vetor de string com 12 posicoes
        String meses[] = new String[12];
        meses[0] = "Janeiro";
        meses[1] = "Fevereiro";
        meses[2] = "Março";
        meses[3] = "Abril";
        meses[4] = "Maio";
        meses[5] = "Junho";
        meses[6] = "Julho";
        meses[7] = "Agosto";
        meses[8] = "Setembro";
        meses[9] = "Outubro";
        meses[10] = "Novembro";
        meses[11] = "Dezembro";

        int num = -1;
        while (num != 0) {
            System.out.println("Informe o nro do mes ou 0 para sair");
            num = Integer.parseInt(reader.readLine());
            if (num > 0 && num <= 12) {
                System.out.println("O mes é " + meses[num - 1]);
            }
        }

    }

}
