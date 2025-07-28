package NivelIniciante.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");
        System.out.print("Escolha um Personagem: ");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("você digitou o numero: " + escolhaDoUsuario);

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha, o ninja mais revoltado");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno, a personagem feminina mais legal");
                break;
            default:
                System.out.println("Você não digitou uma resposta valida, Tente Denovo.");
        }






        scanner.close();
    }
}
