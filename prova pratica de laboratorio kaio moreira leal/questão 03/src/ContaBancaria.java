public class ContaBancaria {
    private double saldo = 0;

    public String depositar(double valor){
        saldo += valor;
        return "Deposito efetuado com sucesso.";
    }

    public String saque(double valor){
        String retorno = "Saque indisponivel";
        
        if(valor <= saldo){
            saldo -= valor;
            retorno = "Saque efetuado com sucesso";
        }
        return retorno;
    }

    double getSaldo(){
        return saldo;
    }
}
