public class Companhia {
    private String nomeDaCompanhia;
    private Voo[] listaDeVoos = new Voo[10];
    private int totalDeVoos;

    public String getNomeDaCompanhia() {
        return nomeDaCompanhia;
    }

    public void setNomeDaCompanhia(String nomeDaCompanhia) {
        this.nomeDaCompanhia = nomeDaCompanhia;
    }

    public Voo[] getListaDeVoos() {
        return listaDeVoos;
    }

    public int getTotalDeVoos() {
        return totalDeVoos;
    }

    public void cadastrarVoo(Voo voo) {
        if (totalDeVoos < listaDeVoos.length) {
            listaDeVoos[totalDeVoos] = voo;
            totalDeVoos++;
        } else {
            System.out.println("Companhia lotada");
        }
    }
}
