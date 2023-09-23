/*Exercício 7: Crie uma classe Banco com um método 
estático calculaTaxaJuros(double saldo) que calcula e 
retorna uma taxa de juros com base no saldo. 
Implemente uma taxa fixa para saldos positivos e outra 
taxa fixa para saldos negativos. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("digite o saldo:");
        double saldo = sc.nextDouble();

        System.out.println("Juros mensal de 1.5% ao mes, o saldo resultante é de "+banco.calcularTaxaJurus(saldo));
        sc.close();
    }
}
