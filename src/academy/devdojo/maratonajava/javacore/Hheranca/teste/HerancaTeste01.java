package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("40389-555");
        Pessoa pessoa = new Pessoa("Shikamaru\"");
        pessoa.setCpf("12345678910");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Naruto");
        funcionario.setCpf("03113206599");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        funcionario.imprime();
    }
}
