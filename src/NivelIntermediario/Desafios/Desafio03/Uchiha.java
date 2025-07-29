package NivelIntermediario.Desafios.Desafio03;

public class Uchiha extends Ninja{
    String habilidadeEspecial;


    public void mostrarInformacoes(String nome, int idade, String nivel, String status, String habilidade) {
        System.out.println("Uchiha: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nível de Dificuldade: " + nivel);
        System.out.println("Status da Missão: " + status);
        System.out.println("Habilidade Especial: " + habilidade);
        System.out.println("-----------------------------");
    }
}
