package NivelIntermediario.Desafios.Desafio04;

public class Main {
    public static void main(String[] args) {

        NinjaBasico ninjaBasico = new NinjaBasico("Naruto", 18, "Rasengan");
        ninjaBasico.mostrarInformacao();
        ninjaBasico.executarHabilidade();

        System.out.println("--------------------------------------------");

        NinjaAvancado ninjaAvancado = new NinjaAvancado("Sasuke", 18, "Chidori", "Ninjutsu");
        ninjaAvancado.mostrarInformacao();
        ninjaAvancado.executarHabilidade();

    }
}
