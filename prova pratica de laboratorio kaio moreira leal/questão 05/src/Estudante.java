public class Estudante extends Pessoa{
    String nome;
    public Estudante(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    @Override
    public String toString(){

        return "Dados do estudante\nnome:"+ nome + " | idade:"+ idade;
    }
}
