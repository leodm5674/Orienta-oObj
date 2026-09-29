
public class Vendedor extends Funcionario {
    private Float comissao;
    private int MetaVendas;
    public int QuantidadeDeVendas;

    public Float getComissao() {
        return comissao;
    }
    public void setComissao(Float comissao) {
        this.comissao = comissao;
    }
    public int getMetaVendas() {
        return MetaVendas;
    }
    public void setMetaVendas(int metaVendas) {
        MetaVendas = metaVendas;
    }
    public int getQuantidadeDeVendas() {
        return QuantidadeDeVendas;
    }
    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        QuantidadeDeVendas = quantidadeDeVendas;
    }
 

}
