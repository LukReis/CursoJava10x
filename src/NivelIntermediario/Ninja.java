package NivelIntermediario;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    public void SharinganAtivado() {
        System.out.println("O Sharingan Ativou");
    }

    public String euSouUmNinja() {
        return "Oi, eu sou um Ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
