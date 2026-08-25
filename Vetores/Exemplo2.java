import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Exemplo2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        int num = -1;
        Meses meses = new Meses();
        while (num != 0) {
            System.out.println("Informe o nro do mes ou 0 para sair");
            num = Integer.parseInt(reader.readLine());

            String mes = meses.pegarNomesMes(num);

            if (!mes.equals("")) {
                System.out.println("O mes é " + mes);
            } else if (num != 0) {
                System.out.println("Valor invalido");
            }
        }
    }
}