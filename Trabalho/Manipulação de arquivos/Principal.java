import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Principal {

    public static void main(String[] args) throws Exception {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Digite o arquivo de entrada:");
        String nomeArqEntrada = leitor.readLine();
        if (nomeArqEntrada.equals("")) {
            nomeArqEntrada = "preco_custo.csv";
        }

        System.out.print("Digite o arquivo de saida: ");
        String nomeArqSaida = leitor.readLine();
        if (nomeArqSaida.equals("")) {
            nomeArqSaida = "preco_venda.csv";
        }

        System.out.print("digite a margem de lucro: ");
        float margemLucro = Float.parseFloat(leitor.readLine());

        BufferedReader arquivoLeitura = new BufferedReader(new FileReader(nomeArqEntrada));
        BufferedWriter arquivoSaida = new BufferedWriter(new FileWriter(nomeArqSaida));
        BufferedWriter arquivoComprar = new BufferedWriter(new FileWriter("comprar.csv"));

        String linha;

        while ((linha = arquivoLeitura.readLine()) != null) {
            String[] dados = linha.split(";");

            int codigo = Integer.parseInt(dados[0]);
            int estoque = Integer.parseInt(dados[1]);
            String nomeProduto = dados[2];
            float precoCusto = Float.parseFloat(dados[3]);
            String categoria = dados[4];

            Produto p = new Produto();
            p.setCodigo(codigo);
            p.setEstoque(estoque);
            p.setNomeProduto(nomeProduto);
            p.setPrecoCusto(precoCusto);
            p.setCategoria(categoria);

        }

        arquivoLeitura.close();
        arquivoSaida.close();
        arquivoComprar.close();
        leitor.close();
    }
}
