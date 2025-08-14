package NivelIntermediario.Polimorfismo;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque Uchiha, um ataque de fogo. eu ja completei: " + numeroMissoesConcluidas + " Missões");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é a minha inteligencia de Combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um genio");
        } else if (qi >=130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja Promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estrategias");
        }
    }


}
