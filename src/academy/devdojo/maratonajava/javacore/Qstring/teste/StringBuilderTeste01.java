package academy.devdojo.maratonajava.javacore.Qstring.teste;

public class StringBuilderTeste01 {
    public static void main(String[] args) {
        String nome = "Roberto Bomfim";
        nome.concat(" Dev Java Beckend.");
        nome = nome.substring(0, 3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Roberto Bomfim");
        sb.append(" DevDojo").append(" Academy");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 3);
        System.out.println(sb);
    }
}
