/*Exercício 9: Crie uma classe GerenciadorDeArquivos 
com um método estático lerArquivo(String 
nomeArquivo) que simule a leitura de um arquivo e 
exiba seu conteúdo */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GerenciadorDeArquivo ga = new GerenciadorDeArquivo();

        System.out.println("Digite o nome do arquivo:");
        String nomeArquivo=sc.nextLine();
        ga.lerArquivo(nomeArquivo);
        sc.close();
    }
}
