package academy.devdojo.maratonajava.introducao.operadores;

public class Aula04Operadores {
    public static void main(String[] args) {
        int num01 = 15;
        int num02 = 14;
        int soma = num01 + num02;
        System.out.println(soma);

        // %(resto)

        int resto = 21 % 4;
        System.out.println(resto);

       //operadores relacionais: < > <= >= == !=
       boolean isDezMaiorQueVinte = 10 > 20;
       boolean isDezMenorQueVinte = 10 < 20;
       boolean isDezIgualVinte = 10 == 20;
       boolean isDezIgualDez = 10 == 10;
       boolean isDezDiferenteDez = 10 != 10;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezIgualDez " + isDezIgualDez);
        System.out.println("isDezDiferenteDez " + isDezDiferenteDez);
    }
}
