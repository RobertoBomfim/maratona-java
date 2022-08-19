package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Kyrie");
        jogador1.imprime();
        Time time = new Time("Nets");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
