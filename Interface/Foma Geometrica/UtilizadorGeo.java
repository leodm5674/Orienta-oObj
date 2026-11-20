
package Atividades;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UtilizadorGeo {

    public static void main(String[] args) throws Exception {
        int op;
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite o que gostaria de calcular");
        System.out.println("1-Area do Quadrado");
        System.out.println("2-Area do Retangulo");
        System.out.println("3-Area do Circulo");
        System.out.println("Escolha:");
        op = Integer.parseInt(leitor.readLine());

        switch (op) {

            case 1:
                float areadoquadrado;
                System.out.println("Digite a lado do Quadrado");
                areadoquadrado = Float.parseFloat(leitor.readLine());
                Quadrado quadrado = new Quadrado();
                quadrado.setLado(areadoquadrado);
                quadrado.calcularArea(areadoquadrado);
                System.out.println("Resultado " + quadrado.calcularArea());

                break;

            case 2:
                float base;
                float altura;
                System.out.println("Digite a Base do Retangulo");
                base = Float.parseFloat(leitor.readLine());
                System.out.println("Digite a Altura do Retangulo");
                altura = Float.parseFloat(leitor.readLine());
                Retangulo retangulo = new Retangulo();
                retangulo.setAltura(altura);
                retangulo.setBase(base);
                retangulo.setConta(altura, base);
                System.out.println("Resultado " + retangulo.calcularArea());

                break;

            case 3:
                float raio;
                System.out.println("Digite o Raio do Circulo");
                raio = Float.parseFloat(leitor.readLine());
                Circulo circulo = new Circulo();
                circulo.setRaio(raio);
                System.out.println("Resultado: " + circulo.calcularArea());

        }
    }
}
