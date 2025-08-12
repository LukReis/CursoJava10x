package NivelIntermediario.Polimorfismo;

import org.w3c.dom.ls.LSOutput;

public class Uchiha extends Ninja{


@Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é a minha estrategia de batalha! ");
    }

}
