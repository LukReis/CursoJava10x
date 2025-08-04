package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.idade = 18;
        Naruto.ModoSabioAtivado();


       Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 19;
        Sasuke.SharinganAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da Folha";
        Sakura.idade = 18;
        Sakura.ativarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.aldeia = "Aldeia da Folha";
        Hinata.idade = 18;
        Hinata.byakuganAtivado();

        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Aldeia da Folha";
        boruto.idade = 9;

        boruto.ModoSabioAtivado();
        boruto.AtivarOKarma();
        boruto.AtivarJougan();



    }

}
