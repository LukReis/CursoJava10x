package NivelIntermediario.Desafios.Desafio05;

public class ContaPoupanca  extends  ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(String nome, double saldo, TipoDeConta tipoDeConta) {
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
        System.out.println("Meu nome é: " + nome +  " Saldo em conta: " + saldo);
        System.out.println("-------------------------");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositar no valor de: " + valor + " Na conta de: " + nome);
        saldo += valor;
        System.out.println("--------------------------------");
    }
}
