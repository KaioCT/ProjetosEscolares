/*Exercício 2: Crie uma interface chamada Móvel com um 
método mover(). Crie uma classe Carro que implemente 
a interface Móvel e implemente o método mover() para 
exibir "Carro se movendo". */

public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.mover();
    }
}
