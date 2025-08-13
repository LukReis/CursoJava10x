package NivelIntermediario.Heranca;

public class Uzumaki extends Ninja implements HokageInterface{

    @Override
    public void hokageAtivo() {
        System.out.println(nome + ": E eu sou um Hokage");
    }
}
