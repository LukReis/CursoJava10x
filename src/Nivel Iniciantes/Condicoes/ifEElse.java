package Condicoes;

public class ifEElse {
    public static void main(String[] args) {

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 10;
        boolean hogake = false;
        short numeroMissoes = 9;

        if (numeroMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if(numeroMissoes >=20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }
    }
}
