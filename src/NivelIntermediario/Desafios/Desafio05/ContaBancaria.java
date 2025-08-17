package NivelIntermediario.Desafios.Desafio05;

public abstract class ContaBancaria implements Conta {

    String nome;
    double saldo;
    TipoDeConta tipoDeConta;


    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(String nome, double saldo, TipoDeConta tipoDeConta) {
        this.nome = nome;
        this.saldo = saldo;
        this.tipoDeConta = tipoDeConta;
    }

}
