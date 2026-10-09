import java.io.BufferedWriter;
import java.io.FileWriter;

public class Cores {

    public static void main(String[] args) throws Exception {
        String arqhtml = "cores.html";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqhtml));

        String html = "<html><head><title>Tabela de Cores HTML</title>\n" +
                "<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'></head>\n" +
                "<body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2>\n" +
                "<table width='400' align='center' border='1'>\n" +
                "<tr><th width='200' align='center'>Cor</th>\n" +
                "<th width='200' align='center'>Código Hexadecimal</th></tr>\n";

        arqGravacao.write(html);

        String[] hex = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F" };

        for (int r = 0; r < 16; r++) {
            for (int g = 0; g < 16; g++) {
                for (int b = 0; b < 16; b++) {
                    String cor = "#" + hex[r] + "0" + hex[g] + "0" + hex[b] + "0";

                    arqGravacao.write("<tr>");
                    arqGravacao.write("<td bgcolor='" + cor + "'>&nbsp;</td>");
                    arqGravacao.write("<td align='center'>" + cor + "</td>");
                    arqGravacao.write("</tr>\n");
                }
            }
        }

        arqGravacao.write("</table></body></html>");
        arqGravacao.close();
    }
}
