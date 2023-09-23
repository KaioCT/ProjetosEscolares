/*Exercício 5: Crie uma classe Pessoa com atributos nome 
(privado) e idade (protected). Crie uma subclasse 
Estudante que estenda Pessoa e tenha um construtor 
que aceite o nome e a idade do estudante */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um nome :");
        String nome = sc.nextLine();
        System.out.println("Digite a idade:");
        int idade = sc.nextInt();
        Estudante estudante = new Estudante(nome, idade);

        System.out.println(estudante.toString());
        sc.close();
    }
}
