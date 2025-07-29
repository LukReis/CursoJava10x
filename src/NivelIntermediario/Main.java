package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 18;


        Ninja Sasuke = new Ninja();

        String chamandoMetodo = Sasuke.euSouUmNinja();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 18;
        System.out.println(Sasuke.nome);
        System.out.println(Sasuke.aldeia);
        System.out.println(Sasuke.idade);
        Sasuke.SharinganAtivado();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem " + Sasuke.idade + " então falta no minimo: " + quantoTempoFalta + " Anos para você se tornar Hokage");



        Ninja Sakura = new Ninja();

        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;

    }

}
