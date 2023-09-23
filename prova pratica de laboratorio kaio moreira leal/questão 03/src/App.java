/*Exercício 3: Crie uma classe chamada ContaBancaria 
com um atributo privado saldo e métodos públicos 
depositar(double valor) e sacar(double valor). Garanta 
que o saldo não fique negativo após um saque. */

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ContaBancaria cb = new ContaBancaria();
        int op;
        do{
            System.out.println("Menu:\n"+
            "0-sair\n"+
            "1-deposito\n"+
            "2-saque\n"+
            "3-saldo");
            op = sc.nextInt();

            switch(op){
                case 1: 
                    double valor;
                    System.out.println("Digite um valor:");
                    valor = sc.nextDouble();
                    System.out.println(cb.depositar(valor));
                break;

                case 2:
                    System.out.println("Digite um valor:");
                    valor = sc.nextDouble();
                    System.out.println(cb.saque(valor));
                break;

                case 3:
                    System.out.println(cb.getSaldo());
                break;
            }
        }while(op!=0);
        sc.close();
    }

}
