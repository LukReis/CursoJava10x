package NivelIniciante;

public class Array {
    public static void main(String[] args) {


//        String[] ninja = new String[5];
//
//        ninja[0] = "Naruto Uzumaki";
//        ninja[1] = "Sasuke Uchiha";
//        ninja[2] = "Sakura Haruno";
//        ninja[3] = "Hinata Hyuga";
//        ninja[4] = "Kakashi Hatake";
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(ninja[i]);
//        }
//
//        System.out.println(ninja);
//
//        int[] idade = new int[2];
//
//        idade[0] = 16;
//        idade[1] = 17;
//
//        System.out.println(idade[0]);
//
//        boolean[] verdadeiroOuFalso = new boolean[1];
//        System.out.println(verdadeiroOuFalso[0]);


        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konoha";
        ninjasEAldeias[0][1] = "Naruto Uzumaki";
        ninjasEAldeias[0][2] = "Sasuke Uchiha";

        ninjasEAldeias[1][0] = "Nevoa";
        ninjasEAldeias[1][1] = "Kabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeias[i][0] +
                    " Ninja 1: " + ninjasEAldeias[i][1]
                    +  " Ninja 2: " + ninjasEAldeias[i][2]);
        }
    }
}
