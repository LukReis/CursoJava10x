package NivelIniciante.Desafios;

public class Desafio01 {
    public static void main(String[] args) {

        String ninjaOne = "Naruto Uzumaki";
        int idadeNinjaOne = 16;
        String missao = "Encontrar o Bandido";
        String statusDaMissao = "em andamento";
        char nivelDaMissao = 'A';

        if (idadeNinjaOne < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluida";
            } else {
                statusDaMissao = "Não concluida";
            }
        } else  {
            statusDaMissao = "Concluida";
        }

        System.out.println("----------------------------------------");
        System.out.println("-------Informações do Ninja One---------");
        System.out.println("----------------------------------------");
        System.out.println("Nome do Ninja: " + ninjaOne);
        System.out.println("Idade do Ninja: " + idadeNinjaOne);
        System.out.println("Missão do Ninja: " + missao);
        System.out.println("Status da Missão: " + statusDaMissao);
        System.out.println("Nível da Missão: " + nivelDaMissao);
        System.out.println("----------------------------------------");

        String ninjaTwo = "Sasuke Uchiha";
        int idadeNinjaTwo = 16;
        String missaoTwo = "Reconhecimento da aldeia";
        String statusDaMissaoTwo = "em andamento";
        char nivelDaMissaoTwo = 'S';

        if (idadeNinjaTwo < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissaoTwo = "Concluida";
            } else {
                statusDaMissaoTwo = "Não concluida";
            }
        } else  {
            statusDaMissaoTwo = "Concluida";
        }

        System.out.println("-------Informações do Ninja Two---------");
        System.out.println("----------------------------------------");
        System.out.println("Nome do Ninja: " + ninjaTwo);
        System.out.println("Idade do Ninja: " + idadeNinjaTwo);
        System.out.println("Missão do Ninja: " + missaoTwo);
        System.out.println("Status da Missão: " + statusDaMissaoTwo);
        System.out.println("Nível da Missão: " + nivelDaMissaoTwo);
        System.out.println("----------------------------------------");

        String ninjaThree= "Saruka Haruno";
        int idadeNinjaThree = 16;
        String missaoThree = "Curar Feridos da Guerra";
        String statusDaMissaoThree = "Concluido";
        char nivelDaMissaoThree = 'D';

        if (idadeNinjaThree < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissaoThree = "Concluida";
            } else {
                statusDaMissaoThree = "Não concluida";
            }
        } else  {
            statusDaMissaoThree = "Concluida";
        }

        System.out.println("------Informações do Ninja Three--------");
        System.out.println("----------------------------------------");
        System.out.println("Nome do Ninja: " + ninjaThree);
        System.out.println("Idade do Ninja: " + idadeNinjaThree);
        System.out.println("Missão do Ninja: " + missaoThree);
        System.out.println("Status da Missão: " + statusDaMissaoThree);
        System.out.println("Nível da Missão: " + nivelDaMissaoThree);
        System.out.println("----------------------------------------");


    }
}
