package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Kakashi");
        funcionario.setIdade(30);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});

        funcionario.imprime();
        funcionario.media();
    }
}
