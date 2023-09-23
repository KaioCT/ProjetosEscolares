/*Exercício 1: Crie uma classe chamada Animal com um 
método fazerBarulho() que exiba "Animal fazendo 
barulho". Em seguida, crie subclasses Cachorro e Gato 
que estendam a classe Animal e sobrescrevam o método 
fazerBarulho() para exibir "Cachorro fazendo barulho" e 
"Gato fazendo barulho", respectivamente. */

public class App {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        animal.fazerBarulho();
        cachorro.fazerBarulho();
        gato.fazerBarulho();
    }
}
