package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do seu Ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do Ninja é: " + nomeDoNinja);

        System.out.println("Escreva a Idade do Ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A Idade do Ninja é: " + idadeDoNinja);

        if (idadeDoNinja >= 18) {
            System.out.println("Esse Ninja é Maior de Idade e pode ir para missões fora da aldeia ");
        } else {
            System.out.println("Esse Ninja é Muito novo ainda, Precisa treinar mais antes de sair da vila");
        }

        caixaDeTexto.close();
    }
}
