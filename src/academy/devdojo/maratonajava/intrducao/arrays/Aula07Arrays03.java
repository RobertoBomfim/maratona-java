package academy.devdojo.maratonajava.intrducao.arrays;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Inicializar array com valores
        int[] numeros = {1, 2, 3, 4, 5};

        /*for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }*/

        //foreach (simplificação do for padrão, não acessa índices
        for(int num:numeros) {
            System.out.println(num);
        }
    }
}
