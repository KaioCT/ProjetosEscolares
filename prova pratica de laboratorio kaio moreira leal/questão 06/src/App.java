/*Exercício 6: Crie uma classe Circulo com atributo raio 
(privado) e um método público calcularArea() que 
retorna a área do círculo */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Circulo circulo = new Circulo();

        System.out.println("Digite o raio:");
        double raio = sc.nextDouble();
        circulo.setRaio(raio);

        System.out.println("Raio = "+circulo.calcularArea());
        sc.close();
    }
}
