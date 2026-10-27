import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExemploLocalDateTime {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        System.out.println("Data " + data);

        LocalTime hora = LocalTime.now();
        System.out.println("Hora" + hora);

        LocalDateTime dataHora = LocalDateTime.now();
        System.out.println("Hora" + dataHora);

        // formatacao

        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        // DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
        System.out.println("Data Formatada:" + data.format(formatoData));

        // calculador datas
        LocalDate hoje = LocalDate.now();
        LocalDate amanha = hoje.plusDays(1);
        System.out.println("Hoje " + hoje.format((formatoData)));
        System.out.println("Amanha " + amanha.format((formatoData)));

        LocalTime horaAtual = LocalTime.now();
        LocalTime menosUmaHora = horaAtual.minusHours(1);
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Menos 1h: " + menosUmaHora.format((formatoHora)));
        LocalDateTime agora = LocalDateTime.now();
        LocalDateTime futuro = agora.plusDays(5).minusHours(12).plusMinutes(5);
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Agora: " + agora.format(formatoDataHora));
        System.out.println("Futuro: " + futuro.format(formatoData));

        // comparar datas
        if (agora.equals(futuro)) {

        }
        LocalDate minhaData = LocalDate.parse("05/10/2014", formatoData);
        System.out.println("MinhaData: " + minhaData);
        System.out.println("MinhaData Formatada: " + minhaData.format(formatoData));
    }
}
