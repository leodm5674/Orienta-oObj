package Atividades;

public class Quadrado implements FormaGeometrica {

    private float lado;
    private float contaquadrado;

    public float getLado() {
        return lado;
    }

    public float getContaquadrado() {
        return lado * lado;
    }

    public void setContaquadrado(float contaquadrado) {
        this.contaquadrado = contaquadrado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float calcularArea() {

        return lado * lado;
    }
}
