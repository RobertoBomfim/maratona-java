package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTeste01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Attack on titan");
        mangas.add("Berserk");
        mangas.add("Hellsing Ultimate");
        mangas.add("Pokemon");
        mangas.add("Dragon ball z");

        Collections.sort(mangas);

        List<Double> notas = new ArrayList<>();
        notas.add(7.5);
        notas.add(10.3);
        notas.add(5.9);
        notas.add(12.2);

        System.out.println(notas);

        Collections.sort(notas);

        for (String manga : mangas){
            System.out.println(manga);
        }

        System.out.println(notas);

        for (Double nota : notas){
            System.out.println(nota);
        }
        new Manga(null, null, 2);
    }
}
