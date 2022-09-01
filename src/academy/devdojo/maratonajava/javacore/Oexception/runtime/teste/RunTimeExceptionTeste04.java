package academy.devdojo.maratonajava.javacore.Oexception.runtime.teste;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTeste04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException.");
        }  catch (RuntimeException e) {
            System.out.println("Dentro do RunTimeException.");
        }


        try {
            talvezLanceException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, IOException{

    }
}


