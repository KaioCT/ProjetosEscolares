/*Exercício 4: Crie uma classe Triangulo com atributos 
base e altura (ambos privados) e um método público 
calcularArea() que retorna a área do triângulo (base * 
altura / 2) */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Triangulo triangulo = new Triangulo();

        System.out.println("Digite o valor da base:");
        double base = sc.nextDouble();
        triangulo.setBase(base);

        System.out.println("Digite o valor da altura:");
        double altura = sc.nextDouble();
        triangulo.setAltura(altura);

        System.out.println("A area do triangulo é : " + triangulo.calcularArea());
        sc.close();

        
    }
}
