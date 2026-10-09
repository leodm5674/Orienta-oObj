import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {

    public static void main(String[] args) throws Exception {
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(
                new FileWriter(nomeArqSaida));

        String linha = "Produto;Preço;Estoque";
        arqGravacao.write(linha);
        arqGravacao.newLine();

        String nomeProduto = "Mouse Dell d310";
        String preco = "119,25";
        String estoque = "7";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.newLine();
        nomeProduto = "Notebook ";
        preco = "2899,23";
        estoque = "4";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.newLine();
        nomeProduto = "PC ";
        preco = "4523,25";
        estoque = "3";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);

        arqGravacao.close();
    }

}
