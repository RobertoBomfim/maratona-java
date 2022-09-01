package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

public class RunTimeExceptionTeste03 {
    public static void main(String[] args) {
        abrirConexao2();
    }

    private static String abrirConexao() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recurso liberado pelo SO.");
        }
        return null;
    }

    private static void abrirConexao2() {
        try {
            System.out.println("Abrindo arquivo.");
            System.out.println("Escrevendo dados no arquivo.");
            throw new RuntimeException();
        }finally {
            System.out.println("Fechando recurso liberado pelo SO.");
        }
    }
}

