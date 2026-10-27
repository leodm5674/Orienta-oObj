import java.text.DateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ExemploCalendar {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();
        System.out.println("Agora: " + agora);

        Calendar dtVencimento = agora;
        dtVencimento.add(Calendar.DATE, 7);
        System.out.println("Data de Vencimento: " + dtVencimento);

        dtVencimento.add(Calendar.MONTH, -1);
        System.out.println("Nova Data de Vencimento: " + dtVencimento);

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("Ano " + gc.get(Calendar.YEAR));
        System.out.println("Mes " + gc.get(Calendar.MONTH));
        System.out.println("Dia Do Mes " + gc.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da Semana " + gc.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do ANo " + gc.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana do Mes " + gc.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Dia da semana do mes " + gc.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("Dia do ANo " + gc.get(Calendar.HOUR));
        System.out.println("Semana do Mes " + gc.get(Calendar.AM_PM));
        System.out.println("Dia da semana do mes " + gc.get(Calendar.HOUR_OF_DAY));
        System.out.println("Dia do ANo " + gc.get(Calendar.MINUTE));
        System.out.println("Semana do Mes " + gc.get(Calendar.SECOND));
    

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM);
        System.out.println("Data Abreviada" + df.format(gc.getTime()) );
        System.out.println("Vencimento" + dtVencimento.getTime());
        System.out.println("Vencimento" + df.format(dtVencimento.getTime()));
        

        System.out.println("Criando uma especifica");
        GregorianCalendar dtNasc = new GregorianCalendar();
        dtNasc.set(2018, Calendar.FEBRUARY,27);
        System.out.println("Dt Nascimento:" + df.format(dtNasc.getTime()));

        System.out.println("Criando uma data a partir de um String");
        String dataString = "15/07/2025";
        String[] vetDataString = dataString.split("/");
        dtNasc.set(Calendar.YEAR, Integer.parseInt(vetDataString[2]));
        dtNasc.set(Calendar.MONTH, Integer.parseInt(vetDataString[2]) -1);
            //-1 por que o mes começa em 0
        dtNasc.set(Calendar.DAY_OF_MONTH, Integer.parseInt(vetDataString[0]));
        System.out.println("Nova Data " + df.format(dtNasc.getTime()) );

        // ou

        dtNasc.set(Integer.parseInt(vetDataString[2]),
        Integer.parseInt(vetDataString[1]) -1,
         Integer.parseInt(vetDataString[0]));
         System.out.println("Nova data " + df.format(dtNasc.getTime()));

    }

}
