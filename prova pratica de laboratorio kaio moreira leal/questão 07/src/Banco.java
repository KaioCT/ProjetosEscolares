public class Banco {
    
    public static double calcularTaxaJurus(double saldo){
        double resultado = saldo + (saldo * 0.015);
        return resultado;
    }
}
