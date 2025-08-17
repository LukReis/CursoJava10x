package NivelIntermediario.Desafios.Desafio05;

public class ContaCorrente extends ContaBancaria {


    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(String nome, double saldo, TipoDeConta tipoDeConta) {
        super(nome, saldo, tipoDeConta);
    }

    @Override
    public String toString() {
        return "ContaCorrente:" +
                "Nome='" + nome + '\'' +
                ", saldo=" + saldo +
                ", TipoConta=" + tipoDeConta;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo em conta de: " + nome + " E o saldo é de: " + saldo);
        System.out.println("---------------------------------------------------------");
    }


    @Override
    public void depositar(double valor) {
        System.out.println("Deposito no valor de: " + valor + " Na conta de: " + nome);
        System.out.println("Taxa de 1% Aplicada");
        saldo += (valor * 0.99);
        System.out.println("-----------------------");
    }
}
