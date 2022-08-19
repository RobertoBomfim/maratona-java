package academy.devdojo.maratonajava.introducao.estruturasdecontrole;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";

        //operador ternário: (condição) ? verdadeiro : falso

        System.out.println(salario > 5000 ? mensagemDoar : mensagemNaoDoar);
    }
}
