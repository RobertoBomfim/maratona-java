//Exercício Associação
package academy.devdojo.maratonajava.javacore.Gassociacao.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class SistemaSeminariosTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Salvador");
        Aluno aluno = new Aluno("Naruto", 15);
        Professor professor = new Professor("Iruka", "Ninjutsu");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Clone das sombras", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
