package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringTeste01 {
    public static void main(String[] args) {
        String nome = "Roberto";
        String nome2 = "Roberto";
        nome = nome.concat(" Bomfim");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Roberto");//1.criação variável de referência, 2.objeto do tipo string, 3.string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
