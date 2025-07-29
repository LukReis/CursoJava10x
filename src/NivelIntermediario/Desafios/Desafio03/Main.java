package NivelIntermediario.Desafios.Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Ninja ninja = new Ninja();
        Uchiha uchiha = new Uchiha();

        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];
        int[] idadeNinjas = new int[NUMERO_MAX];
        String[] nivelDificuldade = new String[NUMERO_MAX];
        String[] statusMissão = new String[NUMERO_MAX];
        String[] habilidadeEspecial = new String[NUMERO_MAX];


        int ninjasCadastrados = 0;
        int opcoes = 0;

        while (opcoes != 3) {
            System.out.println("\n-------Menu dos Ninjas----------");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Todos Ninjas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcoes = scanner.nextInt();
            scanner.nextLine();


            switch (opcoes) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do Ninja para cadastro");
                        String nomeNinja = scanner.nextLine();

                        System.out.println("Digite a Idade do Ninja para cadastro");
                        int idade = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Digite o Nivel da missão do Ninja para cadastro");
                        String nivelMissao = scanner.nextLine();

                        System.out.println("Digite o Status da Missão do Ninja para cadastro");
                        String statusDaMissão = scanner.nextLine();

                        if (nomeNinja.toLowerCase().contains("uchiha")) {
                            System.out.println("Digite a Habilidade Especial do Uchiha:");
                            habilidadeEspecial[ninjasCadastrados] = scanner.nextLine();
                        } else {
                            habilidadeEspecial[ninjasCadastrados] = "";
                        }

                        ninjas[ninjasCadastrados] = nomeNinja;
                        idadeNinjas[ninjasCadastrados] = idade;
                        nivelDificuldade[ninjasCadastrados] = nivelMissao;
                        statusMissão[ninjasCadastrados] = statusDaMissão;
                        ninjasCadastrados++;

                        System.out.println("Ninja Cadastrado com Sucesso");

                    }
                    break;
                case 2:
                    System.out.println("\n========= Lista de Ninjas ==========");
                        if (ninjasCadastrados == 0) {
                            System.out.println("Nenhum Ninja Cadastrado");
                        } else {
                            for (int i = 0; i < ninjasCadastrados; i++) {
                                if (ninjas[i].toLowerCase().contains("uchiha")) {
                                    uchiha.mostrarInformacoes(
                                            ninjas[i],
                                            idadeNinjas[i],
                                            nivelDificuldade[i],
                                            statusMissão[i],
                                            habilidadeEspecial[i]
                                    );
                                } else {
                                    ninja.mostrarInformacoes(
                                            ninjas[i],
                                            idadeNinjas[i],
                                            nivelDificuldade[i],
                                            statusMissão[i]
                                    );
                                }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Saindo do programa... Aguarde");
                    break;
                default:
                    System.out.println("Opção Invalida, escolha corretamente!");
                    break;
            }
        }
    }
}
