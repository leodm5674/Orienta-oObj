package Atividades;

public class Circulo implements FormaGeometrica {

    private float raio;
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    };
    
    public float calcularArea() {
        return 3.14 * raio * raio;
    }


}
