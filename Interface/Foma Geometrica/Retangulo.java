package Atividades;

public class Retangulo implements FormaGeometrica {

    private float base;
    private float altura;
    private float conta = base * altura;

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }

    public float getConta() {
        return base * altura;
    }

    public float calcularArea() {

        return base * altura;
    }

    public void setConta(float conta) {
        this.conta = conta;
    }
}
