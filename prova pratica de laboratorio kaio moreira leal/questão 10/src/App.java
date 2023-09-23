/*Exercício 10: Crie uma classe Shape com métodos area() 
e perimetro(). Crie subclasses Circulo e Retangulo que 
estendam Shape e implementem esses métodos de 
acordo com suas fórmulas. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();
        Retangulo retangulo = new Retangulo();

        System.out.print("CIRCULO | raio:");
        double raio = sc.nextDouble();
        System.out.println("\nRETANGULO |");
        System.out.println("Base:");
        double base = sc.nextDouble();
        System.out.println("Altura:");
        double altura = sc.nextDouble();

        circulo.setRaio(raio);
        retangulo.setAltura(altura);
        retangulo.setBase(base);

        System.out.println(circulo.toString());
        System.out.println(retangulo.toString());

        sc.close();

    }
}
