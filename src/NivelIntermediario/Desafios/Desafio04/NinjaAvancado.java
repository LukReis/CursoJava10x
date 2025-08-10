package NivelIntermediario.Desafios.Desafio04;

public class NinjaAvancado extends NinjaBasico implements Ninja{

    String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        super(nome, idade, habilidade);
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacao() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha Habilidade é: " + habilidade);
        System.out.println("Minha especialidade é: " + especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("meu nome é " + this.nome + " e eu executei minha habilidade " + habilidade);
    }
}
