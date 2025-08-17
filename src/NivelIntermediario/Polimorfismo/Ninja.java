package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements EstrategiaDeBatalha {



    String nome;
    String aldeia;
    int idade;
    int numeroMissoesConcluidas;
    NivelNinja rank;



    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja(String nome, String aldeia, int idade, int numeroMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroMissoesConcluidas = numeroMissoesConcluidas;
        this.rank = rank;
    }



    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial!");
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é: " + nome + " Essa é a minha estrategia de Combate!");
    }


    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é: " + nome + " Essa é a minha inteligencia de Combate!");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um genio");
        } else if (qi >=130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja Promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estrategias");
        }
    }

    public void metodoProvisorio() {
        System.out.println("Teste na classe ninja");
    }

    @Override
    public String toString() {
        return "Meu Nome é: " + nome +
                " Eu sou da " + aldeia +
                " e tenho " + idade +
                " Anos";
    }
}
