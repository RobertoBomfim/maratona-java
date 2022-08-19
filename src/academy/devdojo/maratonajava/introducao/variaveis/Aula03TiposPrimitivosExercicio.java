package academy.devdojo.maratonajava.introducao.variaveis;
/*
Prática

Criar variáveis para os campos descritos abaixo entre <> e imprimir a seguinte mensagem:

Eu <nome>, morando no <endereço>,
confirmo que recebi o salário de <salario> na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Roberto";
        String endereco = "Rua Saldanha Marinho";
        float salario = 2000F;
        String data = "10/08/2022";

        System.out.println("Eu " + nome + ", " + "morando na " + endereco + ", " + "confirmo que recebi o salário de R$ " + salario + "na data " + data + ".");
    }
}
