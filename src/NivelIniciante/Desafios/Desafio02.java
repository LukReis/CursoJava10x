package NivelIniciante.Desafios;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int NUMERO_MAX = 10;
    String[] ninjas = new String[NUMERO_MAX];

    int ninjasCadastrado = 0;
    int opcoes = 0;



    while (opcoes != 4) {

        System.out.println("\n-------Menu dos Ninjas----------");
        System.out.println("1 - Cadastrar Ninja");
        System.out.println("2 - Listar Todos Ninjas");
        System.out.println("3 - Excluir ultimo Item");
        System.out.println("4 - Sair");
        System.out.print("Escolha uma opção: ");
        opcoes = scanner.nextInt();
        scanner.nextLine();

        switch (opcoes) {
            case 1:
                if (ninjasCadastrado < NUMERO_MAX) {
                    System.out.println("Digite o nome do Ninja para cadastro");
                    String nomeNinja = scanner.nextLine();
                    ninjas[ninjasCadastrado] = nomeNinja;
                    ninjasCadastrado++;
                    System.out.println("Ninja Cadastrado com Sucesso");
                } else {
                    System.out.println("Quantidade de Cadastro Excedida. ");
                }
                break;
            case 2:
                    System.out.println("========= Lista de Ninjas ==========");
                for (int i = 0; i < ninjas.length; i++) {
                    if (ninjasCadastrado == 0) {
                        System.out.println("Nenhum Ninja Cadastrado");
                    } else {
                    System.out.println(ninjas[i]);
                    }
                }
                break;
            case 3:
                if (ninjasCadastrado > 0) {
                    ninjasCadastrado--;
                    ninjas[ninjasCadastrado] = null;
                    System.out.println("Último ninja removido.");
                } else {
                    System.out.println("Nenhum ninja para remover.");
                }
            case 4:
                System.out.println("Saindo do programa... Aguarde");
                break;
            default:
                System.out.println("Selecione uma opcão valida.");
        }







    }

    }
}
