package NivelIntermediario.Desafios.Desafio05;

public class BancoKonoha {
    public static void main(String[] args) {

        System.out.println("Bem vindo ao bando de Konoha");
        System.out.println("----------------------------");

        ContaCorrente naruto = new ContaCorrente("Naruto Uzumaki",200, TipoDeConta.CORRENTE);
        naruto.depositar(50);
        naruto.consultarSaldo();
        naruto.depositar(500);
        naruto.consultarSaldo();


        ContaPoupanca sasuke = new ContaPoupanca("Sasuke Uchiha", 1500, TipoDeConta.POUPANCA);
        sasuke.consultarSaldo();
        sasuke.depositar(5000);
        sasuke.consultarSaldo();











    }
}
