package NivelIntermediario.Desafios.Desafio04;

public class NinjaBasico implements Ninja{
    String nome;
    int idade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


    public void mostrarInformacao() {
        System.out.println("Meu nome é: " + nome);
        System.out.println("Minha idade é: " + idade);
        System.out.println("Minha Habilidade é: " + habilidade);
    }

    public void executarHabilidade() {

    }
}
