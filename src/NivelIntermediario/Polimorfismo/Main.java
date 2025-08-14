package NivelIntermediario.Polimorfismo;

public class Main {
    public static void main(String[] args) {



        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 18, 50, NivelNinja.GENIN);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();


        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();
        sasuke.estrategiaDeBatalhaNinja();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 450, NivelNinja.GENIN);
        itachi.habilidadeEspecial();
        itachi.estrategiaDeBatalhaNinja();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 45,900,NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();

        //metodo comum
        madara.inteligenciaDeCombate();

        //metodo sobrecarregado
        madara.inteligenciaDeCombate(90);




    }
}
