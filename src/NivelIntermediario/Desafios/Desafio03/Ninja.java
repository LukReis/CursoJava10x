package NivelIntermediario.Desafios.Desafio03;

public class Ninja {
    String nome;
    int idade;
    String nivelDificuldade;
    String statusMissao;


    public void mostrarInformacoes(String nome, int idade, String nivel, String status) {
        System.out.println("Ninja: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nível de Dificuldade: " + nivel);
        System.out.println("Status da Missão: " + status);
    }
}

