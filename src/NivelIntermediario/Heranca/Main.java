package NivelIntermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();


        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da Folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.sharinganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();

        Uzumaki uzumaki = new Uzumaki();
        uzumaki.nome = "Naruto Uzumaki";
        uzumaki.aldeia = "Aldeia da Folha";
        uzumaki.idade = 18;

    }
}
