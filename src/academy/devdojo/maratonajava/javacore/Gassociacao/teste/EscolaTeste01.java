package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Iruka", "Kakashi");
        Professor professor2 = new Professor("Iruka", "Itachi");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Anbu", professores);

        escola.imprime();
    }
}
