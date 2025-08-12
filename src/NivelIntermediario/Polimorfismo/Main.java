package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {



        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();



    }
}
