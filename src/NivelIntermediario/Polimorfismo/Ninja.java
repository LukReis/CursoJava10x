package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    int aldeia;
    int idade;

    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é a minha estrategia de Combate!");
    }
}
