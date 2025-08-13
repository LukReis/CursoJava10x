package NivelIntermediario.Heranca;

public class Uchiha extends Ninja implements SharinganInterface {


    @Override
    public void sharinganAtivado() {
        System.out.println("Eu sou "+ nome + " Ativei o Sharingan");
    }
}
