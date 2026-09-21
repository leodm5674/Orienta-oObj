public class Voo {
    private String codigodovoo;
    private String origem;
    private String destino;
    private String data;
    private String hora;
    private Passageiro[] passageiros = new Passageiro[50];
    private int quantidadePassageiros;

    

    public String getCodigodovoo() {
        return codigodovoo;
    }

    public void setCodigodovoo(String codigo) {
        this.codigodovoo = codigo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }
}
