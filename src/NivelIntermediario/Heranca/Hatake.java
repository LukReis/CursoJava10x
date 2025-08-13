package NivelIntermediario.Heranca;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface{

    public void boasVindas(){
        System.out.println(nome + " Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou "+ nome + " E Ativei o Sharingan");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome + " E eu sou um Ninja de Elite");
    }

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": E eu sou hokage");
    }
}
