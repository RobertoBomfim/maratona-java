package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTeste01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(5L, "Attack on titan", 10.5, 0));
        mangas.add(new Manga(4L,"Berserk", 15.70, 5));
        mangas.add(new Manga(8L,"Hellsing Ultimate", 20, 0));
        mangas.add(new Manga(7L, "Pokemon", 35.60, 2));
        mangas.add(new Manga(6L, "Dragon ball z", 40.10, 0));
        mangas.add(new Manga(6L, "Dragon ball z", 40.10, 0));

        for (Manga manga : mangas){
            System.out.println(manga);
        }
    }
}

