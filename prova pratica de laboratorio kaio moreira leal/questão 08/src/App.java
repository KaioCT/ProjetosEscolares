/*Exercício 8: Crie uma interface chamada Imprimivel com 
um método imprimir(). Em seguida, crie classes 
Documento e Foto que implementem a interface 
Imprimivel e exibam mensagens diferentes no método 
imprimir() */

public class App {
    public static void main(String[] args) throws Exception {
        Documento documento = new Documento();
        Foto foto = new Foto();

        documento.imprimir();
        foto.imprimir();
    }
}
