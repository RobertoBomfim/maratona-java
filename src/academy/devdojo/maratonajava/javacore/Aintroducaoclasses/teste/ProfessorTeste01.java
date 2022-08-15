package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Itachi";
        professor.idade = 25;
        professor.sexo = 'M';

        System.out.println("Nome " + professor.nome + " idade:" + professor.idade + " sexo:" + professor.sexo);
    }
}
